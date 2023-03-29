package com.geektech.pixabay

data class PixaModel(
    var hits: ArrayList<ImageModel>
)

data class ImageModel(
    var largeImageUrl: String
)