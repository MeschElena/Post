data class SizesPhoto(
    val type: String,
    val url: String,
    val width: Int,
    val height: Int
)

data class Image(
    val height: Int,
    val url: String,
    val width: Int,
    val withPadding: Int
)

data class FirstFrame(
    val height: Int,
    val url: String,
    val width: Int
)

data class PhotoPreview(
    val size: SizesPhoto
)

data class Graffiti(
    val src: String,
    val width: Int,
    val height: Int
)

data class AudioMessage(
    val duration: Int,
    val waveform: Array<Int>,
    val linkOgg: String,
    val linkMp3: String
)


data class Preview(
    val photo: PhotoPreview,
    val graffiti: Graffiti,
    val audioMessage: AudioMessage
)

data class Photo(
    val id: Int,
    val albumID: Int,
    val OwnerId: Int,
    val UserId: Int,
    val text: String,
    val data: Int,
    val sizes: Array<SizesPhoto>,
    val width: Int,
    val height: Int
)

data class Video(
    val id: Int,
    val OwnerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val image: Array<Image>,
    val firstFrame: Array<FirstFrame>,
    val data: Int,
    val addingData: Int,
    val views: Int,
    val localViews: Int,
    val comments: Int,
    val player: String,
    val platform: String,
    val canAdd: Boolean,
    val isPrivate: Int,
    val accessKey: String,
    val processing: Int,
    val isFavorite: Boolean,
    val canComment: Boolean,
    val canEdit: Boolean,
    val canLike: Boolean,
    val canRepost: Boolean,
    val canSubcribe: Boolean,
    val canAddToFaves:Boolean,
    val canAttachLink: Boolean,
    val width: Int,
    val height: Int,
    val userId: Int,
    val converting: Boolean,
    val added: Boolean,
    val isSubscribed: Boolean,
    val repeat: Int,
    val type: String,
    val balance: Int,
    val liveStatus: String,
    val live: Int,
    val ipcoming: Int,
    val spectators: Int,
    val likes: Likes,
    val reposts: Reposts
)

data class Audio(
    val id: Int,
    val OwnerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val data: Int,
    val noSearch: Boolean,
    val isHq: Boolean
)

data class Sticker(
    val productId: Int,
    val stickerId: Int,
    val image: Array<Image>,
    val imagesWithBackground: Array<Image>,
    val animationUrl: String,
    val isAllowed: Boolean
)

data class File(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val data: Int,
    val type: Int,
    val preview: Preview
)


interface Attachment{
    val type: String
}

data class AttachmentVideo(
    override val type: String = "video",
    val video: Video
): Attachment

data class AttachmentPhoto(
    override val type: String = "photo",
    val photo: Photo
): Attachment

data class AttachmentAudio(
    override val type: String = "audio",
    val audio: Audio
): Attachment

data class AttachmentFile(
    override val type: String = "file",
    val file: File
): Attachment

data class AttachmentSticker(
    override val type: String = "sticker",
    val sticker: Sticker
): Attachment