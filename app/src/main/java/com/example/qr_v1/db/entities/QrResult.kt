package com.example.qr_v1.db.entities

import androidx.room.*
import com.example.qr_v1.db.converters.DateTimeConverters
import java.util.*

@Entity
@TypeConverters(DateTimeConverters::class)
data class QrResult (

    @PrimaryKey(autoGenerate = true)
    val id : Int ? = null,

    @ColumnInfo(name = "result")
    val result : String?,

    @ColumnInfo(name = "result_type")
    val resultTYpe : String?,

    @ColumnInfo(name = "favourite")
    val favourite : Boolean = false,

    @ColumnInfo(name = "time")
    val calendar : Calendar
)