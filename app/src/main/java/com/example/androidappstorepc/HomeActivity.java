package com.example.androidappstorepc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_DeviceDefault);
        setContentView(R.layout.activity_home);
        Game[] myListData = new Game[] {
                new Game("Assassin's Creed Valhalla","Assassin's Creed Valhalla est un jeu vidéo d'action-aventure et de rôle, développé par Ubisoft Montréal et édité par Ubisoft, sorti en novembre 2020 sur Microsoft Windows, PlayStation 4, Xbox One, Xbox Series, Google Stadia et PlayStation 5. ",R.drawable.assassin),
                new Game("Call of Duty: Warzone","Call of Duty: Warzone est un jeu vidéo de battle royale développé par Infinity Ward et Raven Software et édité par Activision, sorti le 10 mars 2020 sur Xbox One, PlayStation 4 et Microsoft Windows. Le jeu fait partie du titre Call of Duty: Modern Warfare, sorti en 2019, mais est jouable gratuitement. ", R.drawable.callofdutty),
                new Game("Ghostrunner","Ghostrunner est un jeu vidéo d'action cyberpunk développé par le studio de développement polonais One More Level et édité par All in! Games. Le jeu est sorti sur PC, Xbox One, et PlayStation 4 le 27 octobre 2020. Il sortira en novembre 2020 sur Nintendo Switch puis en 2021 sur PlayStation 5 et Xbox Series.",R.drawable.ghost),
                new Game("Grand Theft Auto V","Grand Theft Auto V est un jeu vidéo d'action-aventure, développé par Rockstar North et édité par Rockstar Games en 2013. Faisant partie de la série vidéoludique série des jeux vidéo Grand Theft Auto, il est une suite de l'univers fictif introduit dans Grand Theft Auto IV, sorti en 2008.",R.drawable.gta5),
                new Game("Tom Clancy's Rainbow Six: Quarantine","Tom Clancy's Rainbow Six: Quarantine est un jeu vidéo survival horror en coopération à trois développé par Ubisoft Montréal et édité par Ubisoft, prévu sur PlayStation 4, Xbox One, Windows, PlayStation 5 et Xbox Series. ", R.drawable.rainbow),
                new Game("Resident Evil 3","Resident Evil 3 est un jeu vidéo de tir à la troisième personne de type survival horror développé et édité par Capcom, sorti le 3 avril 2020 sur Microsoft Windows, PlayStation 4 et Xbox One. Ce jeu est un remake de Resident Evil 3: Nemesis sorti en 1999 sur PlayStation.", R.drawable.resident),
                new Game("Valorant","Valorant est un jeu vidéo free-to-play de tir à la première personne en multijoueur développé et édité par Riot Games et sorti le 2 juin 2020.", R.drawable.valorant),
                new Game("Yakuza: Like a Dragon","Yakuza: Like a Dragon est un jeu vidéo de rôle développé par le Ryu ga Gotoku Studio et édité par Sega. Il s'agit du septième épisode de la série Yakuza.", R.drawable.yakuza),
                new Game("PUBG ","PlayerUnknown's Battlegrounds est un jeu vidéo multijoueur en ligne de type battle royale développé et édité par PUBG Corporation. Il est disponible en accès anticipé sur Microsoft Windows à partir du 23 mars 2017, et la version 1.0 du jeu est sortie le 20 décembre 2017.", R.drawable.pubg),
                new Game("fortnite","Fortnite est un jeu en ligne développé par Epic Games sous la forme de différents progiciels proposant différents modes de jeu qui partagent le même gameplay général et le même moteur de jeu.", R.drawable.fortnite),
        };
        RecyclerView mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(HomeActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);
        MyListAdapter myAdapter = new MyListAdapter(HomeActivity.this, myListData);
        mRecyclerView.setAdapter(myAdapter);
    }
}