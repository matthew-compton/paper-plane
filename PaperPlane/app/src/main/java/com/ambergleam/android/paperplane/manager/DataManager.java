package com.ambergleam.android.paperplane.manager;

import android.content.Context;

import com.google.android.gms.common.api.GoogleApiClient;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DataManager implements UpdateInterface {

    private LeaderboardManager mLeaderboardManager;
    private AchievementManager mAchievementManager;

    @Inject
    public DataManager(LeaderboardManager leaderboardManager, AchievementManager achievementManager) {
        mLeaderboardManager = leaderboardManager;
        mAchievementManager = achievementManager;
    }

    @Override
    public void update(int time, int distance) {
        mLeaderboardManager.update(time, distance);
        mAchievementManager.update(time, distance);
    }

    @Override
    public void save(Context context, GoogleApiClient mGoogleApiClient) {
        mLeaderboardManager.save(context, mGoogleApiClient);
        mAchievementManager.save(context, mGoogleApiClient);
    }

    public int getBestTime() {
        return mLeaderboardManager.getBestTime();
    }

    public int getBestDistance() {
        return mLeaderboardManager.getBestDistance();
    }

    public int getPreviousTime() {
        return mLeaderboardManager.getPreviousTime();
    }

    public int getPreviousDistance() {
        return mLeaderboardManager.getPreviousDistance();
    }

}