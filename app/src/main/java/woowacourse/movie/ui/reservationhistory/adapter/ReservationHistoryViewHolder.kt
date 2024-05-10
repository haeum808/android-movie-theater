package woowacourse.movie.ui.reservationhistory.adapter

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import woowacourse.movie.databinding.HolderScreenReservationHistoryBinding
import woowacourse.movie.db.ReservationHistory

class ReservationHistoryViewHolder(
    private val binding: HolderScreenReservationHistoryBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(reservationHistory: ReservationHistory, onClick: (Long) -> Unit) {
        binding.reservationHistory = reservationHistory

        binding.reservationHistoryLayout.setOnClickListener {
            onClick(reservationHistory.id)
        }
    }
}
