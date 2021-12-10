package database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DatabaseDao {

    @Insert
    fun insert(user:UserEntity)

    @Insert
    fun insert(event:EventEntity)

    @Query("SELECT * FROM Events WHERE username == :username")
    fun fetchEvents(username:String)

}