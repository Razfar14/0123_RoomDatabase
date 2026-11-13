package com.example.roomdb.viewmodel
import android.app.Application

object PenyediaViewModel{
    val Factory = viewModelFactory{
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
    }
    }
}