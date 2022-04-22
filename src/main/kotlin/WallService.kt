class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun createComment(comment: Comment): Comment {
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException("Такой пост не найден")
    }

    fun add(post: Post): Post {
        var postLastId = 0
        if (posts.isNotEmpty()) {
            postLastId = posts.last().id
        }
        posts += post.copy(id = postLastId + 1)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index,postUp) in posts.withIndex()) {
            if (postUp.id == post.id) {
                posts[index] = postUp.copy(
                    id = post.id,
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    postSource = post.postSource,
                    attachment = post.attachment,
                    geo = post.geo,
                    signerId = post.signerId,
                    copyHistory = post.copyHistory,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    postponedId = post.postponedId)
                return true
            }
        }
        return false
    }
}
