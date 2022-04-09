package com.doni.recyclerviw_wisata_payakumbuh
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Wisata(
    val imgWisata: Int,
    val nameWisata: String,
    val descWisata: String
) : Parcelable