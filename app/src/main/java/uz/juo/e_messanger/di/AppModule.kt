package uz.juo.e_messanger.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
class AppModule {

    @Provides
    @Singleton
    fun providePreferenceManager(@ApplicationContext context: Context){

    }
}