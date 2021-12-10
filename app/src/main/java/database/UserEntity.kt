package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Users")
data class UserEntity(
    @PrimaryKey
    var username:String = "",

    @ColumnInfo(name = "password")
    var password:String ="",

    @ColumnInfo(name = "fname")
    var fname:String = "",

    @ColumnInfo(name = "lname")
    var lname:String = "",

    @ColumnInfo(name = "dob")
    var dob:String = ""
)