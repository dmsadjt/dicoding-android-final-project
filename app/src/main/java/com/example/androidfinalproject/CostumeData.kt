package com.example.androidfinalproject

object CostumeData {
    private val costumeName= arrayOf(
        "Makima",
        "Sangonomiya Kokomi",
        "Keqing",
        "Anya",
        "Yor Forger",
        "Yae Miko",
        "Raiden Shogun",
        "Ganyu",
        "Saileach",
        "Chinatsu"
    )

    private val costumePrice = arrayOf(
        80000,
        135000,
        120000,
        95000,
        105000,
        125000,
        125000,
        100000,
        140000,
        90000
    )

    private val costumeSize = arrayOf(
        "L-XL",
        "L",
        "XL",
        "L",
        "XL",
        "L",
        "L",
        "L",
        "XL",
        "L-XL"
    )

    private val costumeImage = arrayOf(
        R.drawable.makima,
        R.drawable.kokomi,
        R.drawable.keqing,
        R.drawable.anya,
        R.drawable.yor,
        R.drawable.yae,
        R.drawable.raiden,
        R.drawable.ganyu,
        R.drawable.saileach,
        R.drawable.chinatsu
    )

    private val costumeDetail = arrayOf(
        "Makima is one of the main antagonists of the Chainsaw Man manga/anime series.",
        "Sangonomiya Kokomi, also called the Pearl of Wisdom, is a support playable character in the 2020 action role-playing fantasy video game Genshin Impact.",
        "As the Yuheng of the Liyue Qixing, she is someone who seeks her own answers instead of idly letting chaos run amok in Liyue.",
        "Anya Forger is the deuteragonist in the Japanese anime and manga series Spy X Family. She is the adoptive daughter of Loid Forger and Yor Forger, having been taking under Loid's care as part of his current mission.",
        "Yor Forger is the tritagonist of the Japanese anime and manga series Spy × Family. She is a 27-year-old assassin who is pretending to be married to Loid Forger and pretending to be the mother of Anya Forger.",
        "Yae Miko(Japanese: 八や重え神み子こ Yae Miko), also known as Guuji Yae (Japanese: 宮ぐう司じ Guuji) or the Guuji, is a playable Electro character in Genshin Impact.",
        "The Raiden Shogun is unique as she is comprised of two beings in one body: Ei, the current Electro Archon of Inazuma; and the Shogun, the puppet created by Ei to act as the ruler of Inazuma in her stead, which also serves as her vessel.",
        "Ganyu (Chinese: 甘雨 Gānyǔ) is a playable Cryo character in Genshin Impact. She is a half-qilin Adeptus under contract with the Geo Archon Morax and serves as the general secretary of the Liyue Qixing.",
        "A former ceremonial standard bearer from Victoria, she served at the Victorian Army Barracks in County Hillock, where the head of the local Rhodes Island branch office presented her to us as a liaison operator. ",
        "Chinatsu Kano (鹿野 千夏 Kano Chinatsu?) is one of the main characters of the Blue Box manga series. She is a second-year student at Eimei Senior High School and a member of the Basketball Team."
    )

    private val costumePieces = arrayOf(
        4,8,6,3,5,7,6,10,10,3
    )

    private val costumeSources = arrayOf(
        "Kakao",
        "Saluja",
        "Saluja",
        "Kakao",
        "Saluja",
        "Saluja",
        "Kakao",
        "Shopii",
        "Shopedia",
        "Shopedia"
    )

    val listData : ArrayList<Costume>
        get(){
            val list = arrayListOf<Costume>()
            for(position in costumeName.indices){
                val costume = Costume()
                costume.name = costumeName[position]
                costume.price = costumePrice[position]
                costume.size = costumeSize[position]
                costume.detail = costumeDetail[position]
                costume.photo = costumeImage[position]
                costume.pieces = costumePieces[position]
                costume.source = costumeSources[position]
                list.add(costume)
            }
            return list
        }

}