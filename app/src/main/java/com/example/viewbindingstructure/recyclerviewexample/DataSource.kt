package com.example.viewbindingstructure.recyclerviewexample

import com.example.viewbindingstructure.recyclerviewexample.models.Live

class DataSource {

    companion object{

        fun createDataSet() : ArrayList<Live>{

            val list = ArrayList<Live>()
            list.add(
                Live(
                    "Archive 81",
                    "Rebecca Sonnenshine",
                    "https://epipoca.com.br/wp-content/uploads/2022/01/Arquivo-81-critia.jpeg",
                    "https://www.youtube.com/watch?v=ibxKEqxARkE&ab_channel=Netflix"
                )
            )
            list.add(
                Live(
                    "All of us are dead",
                    "Lee Jae-kyoo;",
                    "https://img.ibxk.com.br/2022/02/04/04144437005231.jpg",
                    "https://www.youtube.com/watch?v=bmbl65oiUgA&ab_channel=NetflixBrasil"
                )
            )
            list.add(
                Live(
                    "The Witcher - Season 2",
                    "Guga Padilha",
                    "https://files.tecnoblog.net/wp-content/uploads/2020/01/the-witcher-netflix.jpg",
                    "https://www.youtube.com/watch?v=OtLG_mWdZZg&ab_channel=NetflixBrasil"
                )
            )
            list.add(
                Live(
                    "Peaky Blinders - Final Season",
                    "Steven Knighta",
                    "https://tm.ibxk.com.br/2020/11/19/19150622444261.jpg?ims=1200x675",
                    "https://www.youtube.com/watch?v=2nsT9uQPIrk&ab_channel=BBC"
                )
            )
            list.add(
                Live(
                    "The Sinner - Final Season",
                    "Derek Simonds",
                    "https://img.ibxk.com.br/2021/11/17/17225640868012.jpg",
                    "https://www.youtube.com/watch?v=kFJbvqZ609w&ab_channel=TVPromos"
                )
            )

            return list
        }
    }

}