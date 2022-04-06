import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPost() {
        //arrange
        val post = Post(0,52,12,5,125866412, "Hello!", 0,0,
            Comments(1, true, 2, true, true),
            Copyright(45, "www.ya.ru", "ya", "web"),
            Likes(4, true, true, true),
            Reposts(4, true),
            Views(65),
            "post", 6, true, true, true, true, true, true, 0
        )

        //act
      //  val result = WallService.add(post).id != 0
        val service = WallService()
    //    val result = service.add(post).id
        val result = service.add(post).id != 0

        //assert
     //   assertEquals(0, result)
        assertEquals(true, result)
    }

    @Test
    fun updatePost_True() {
        //arrange
        val post1 = Post(0,52,12,5,125866412, "Hello!", 0,0,
            Comments(1, true, 2, true, true),
            Copyright(45, "www.ya.ru", "ya", "web"),
            Likes(4, true, true, true),
            Reposts(4, true),
            Views(65),
            "post", 6, true, true, true, true, true, true, 0
        )
        val post2 = Post(0,52,43,5,125866500, "It's may first post!", 1,0,
            Comments(1, true, 2, true, true),
            Copyright(45, "www.ya.ru", "ya", "web"),
            Likes(4, true, true, true),
            Reposts(4, true),
            Views(65),
            "post", 6, true, true, true, true, true, true, 0
        )
        val post3 = Post(0,52,15,5,125866900, "Hello!", 1,0,
            Comments(1, true, 2, true, true),
            Copyright(45, "www.ya.ru", "ya", "web"),
            Likes(4, true, true, true),
            Reposts(4, true),
            Views(65),
            "post", 6, true, true, true, true, true, true, 0
        )
        val post4 = Post(3,52,15,5,125866900, "Hello!", 1,0,
            Comments(1, true, 2, true, true),
            Copyright(45, "www.ya.ru", "ya", "web"),
            Likes(4, true, true, true),
            Reposts(4, true),
            Views(65),
            "post", 6, true, true, true, true, true, true, 0
        )
        val service = WallService()

        service.add(post1)
        service.add(post2)
        service.add(post3)

        val update = post4

        // act
        val result = service.update(update)

        //assert
        assertEquals(true, result)
    }

    @Test
    fun updatePost_False() {
        //arrange
        val post1 = Post(0,52,12,5,125866412, "Hello!", 0,0,
            Comments(1, true, 2, true, true),
            Copyright(45, "www.ya.ru", "ya", "web"),
            Likes(4, true, true, true),
            Reposts(4, true),
            Views(65),
            "post", 6, true, true, true, true, true, true, 0
        )
        val post2 = Post(0,52,43,5,125866500, "It's may first post!", 1,0,
            Comments(1, true, 2, true, true),
            Copyright(45, "www.ya.ru", "ya", "web"),
            Likes(4, true, true, true),
            Reposts(4, true),
            Views(65),
            "post", 6, true, true, true, true, true, true, 0
        )
        val post3 = Post(0,52,15,5,125866900, "Hello!", 1,0,
            Comments(1, true, 2, true, true),
            Copyright(45, "www.ya.ru", "ya", "web"),
            Likes(4, true, true, true),
            Reposts(4, true),
            Views(65),
            "post", 6, true, true, true, true, true, true, 0
        )
        val post4 = Post(4,52,15,5,125866900, "Hello!", 1,0,
            Comments(1, true, 2, true, true),
            Copyright(45, "www.ya.ru", "ya", "web"),
            Likes(4, true, true, true),
            Reposts(4, true),
            Views(65),
            "post", 6, true, true, true, true, true, true, 0
        )
        val service = WallService()

        service.add(post1)
        service.add(post2)
        service.add(post3)

        val update = post4

        // act
        val result = service.update(update)

        //assert
        assertEquals(false, result)
    }
}