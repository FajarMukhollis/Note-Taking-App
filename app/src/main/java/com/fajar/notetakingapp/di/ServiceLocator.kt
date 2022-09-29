package com.fajar.notetakingapp.di

import android.content.Context
import com.fajar.notetakingapp.data.local.database.AppDatabase
import com.fajar.notetakingapp.data.local.note.NoteDao
import com.fajar.notetakingapp.data.local.note.NoteDataSource
import com.fajar.notetakingapp.data.local.note.NoteDataSourceImpl
import com.fajar.notetakingapp.data.local.user.UserDao
import com.fajar.notetakingapp.data.local.user.UserDataSource
import com.fajar.notetakingapp.data.local.user.UserDataSourceImpl
import com.fajar.notetakingapp.data.repository.LocalRepository
import com.fajar.notetakingapp.data.repository.LocalRepositoryImpl

object ServiceLocator {

    fun provideAppDatabase(context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    fun provideUserDao(context: Context): UserDao {
        return provideAppDatabase(context).userDao
    }

    fun provideUserDataSource(context: Context): UserDataSource {
        return UserDataSourceImpl(provideUserDao(context))
    }

    fun provideNoteDao(context: Context): NoteDao {
        return provideAppDatabase(context).noteDao
    }

    fun provideNoteDataSource(context: Context): NoteDataSource {
        return NoteDataSourceImpl(provideNoteDao(context))
    }

    fun provideServiceLocator(context: Context): LocalRepository {
        return LocalRepositoryImpl(
            provideUserDataSource(context),
            provideNoteDataSource(context)
        )
    }
}