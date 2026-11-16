package com.google.android.exoplayer2.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.Player;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends BroadcastReceiver {
    public final /* synthetic */ PlayerNotificationManager a;

    public c(PlayerNotificationManager playerNotificationManager) {
        this.a = playerNotificationManager;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PlayerNotificationManager playerNotificationManager = this.a;
        Player player = playerNotificationManager.player;
        if (player != null && playerNotificationManager.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, playerNotificationManager.instanceId) == playerNotificationManager.instanceId) {
            String action = intent.getAction();
            if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                if (player.getPlaybackState() == 1) {
                    player.prepare();
                } else if (player.getPlaybackState() == 4) {
                    player.seekToDefaultPosition(player.getCurrentMediaItemIndex());
                }
                player.play();
                return;
            }
            if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                player.pause();
                return;
            }
            if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                player.seekToPrevious();
                return;
            }
            if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                player.seekBack();
                return;
            }
            if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                player.seekForward();
                return;
            }
            if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                player.seekToNext();
                return;
            }
            if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                player.stop(true);
                return;
            }
            if ("com.google.android.exoplayer.dismiss".equals(action)) {
                playerNotificationManager.stopNotification(true);
            } else {
                if (action == null || playerNotificationManager.customActionReceiver == null || !playerNotificationManager.customActions.containsKey(action)) {
                    return;
                }
                playerNotificationManager.customActionReceiver.onCustomAction(player, action, intent);
            }
        }
    }
}
