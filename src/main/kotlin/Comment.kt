data class Comment(
    val id: Int,
    val fronId: Int,
    val postId: Int,
    val data: Int,
    val text: String,
    val donut: Donut?,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachment: Attachment?,
    val parentsStack: Array<Int>?,
    val thread: Tread?
)

data class Donut(
    val isDon: Boolean,
    val placeholder: String
    )

data class Tread(
    val count: Int,
    val item: Array<Comment>?,
    val canPost: Boolean,
    val showReplyButton: Boolean,
    val groupsCanPost: Boolean
)