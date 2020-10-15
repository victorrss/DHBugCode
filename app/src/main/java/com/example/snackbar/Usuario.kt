package com.example.snackbar

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Usuario(val id: Int, val username: String, val password: String): Parcelable