package woowacourse.movie.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ReservationHistoryDao {
    @Query("SELECT * FROM reservationHistory")
    fun getAll(): List<ReservationHistory>

    @Query("SELECT * FROM reservationHistory WHERE id = :id")
    fun getById(id: Int): ReservationHistory

    @Insert
    fun insert(reservationHistory: ReservationHistory)
}
