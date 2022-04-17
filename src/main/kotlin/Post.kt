data class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Int,
    val canClose: Boolean,
    val canOpen:Boolean
    ) {

}

data class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String
)

data class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
) {

}

data class Reposts(
    val count: Int,
    val userReposted: Boolean
)

data class Views(
    val count: Int
)

data class Post (
    val id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val data: Int,
    val text: String,
    val replyPostId: Int,
    val friendsOnly: Int,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int

){

}