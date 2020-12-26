package com.aidid.firebase.selectitem.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    var id: String? = null,
    var name: String? = null,
    var points: Int? = null,
    var image: String? = null,
    var selectedQuantity: Int? = null
) : Parcelable