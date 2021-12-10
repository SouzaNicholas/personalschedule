package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

@Entity(tableName="Events",
    foreignKeys = arrayOf(
        ForeignKey(
            entity = UserEntity::class,
            parentColumns = arrayOf("username"),
            childColumns = arrayOf("username")
        )))
class EventEntity(
    @PrimaryKey(autoGenerate = true)
    var eventID:Int = 0,

    @ColumnInfo
    var username:String,

    @ColumnInfo
    var name:String,

    @ColumnInfo
    var date:String,

    @ColumnInfo
    var place:String,

    @ColumnInfo
    var time:Int
)