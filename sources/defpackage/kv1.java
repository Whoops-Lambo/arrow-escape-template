package defpackage;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.PlayerNotificationManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kv1 implements Player.Listener {
    public final /* synthetic */ PlayerNotificationManager a;

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onEvents(Player player, Player.Events events) {
        if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
            this.a.postStartOrUpdateNotification();
        }
    }

    public kv1(PlayerNotificationManager playerNotificationManager) {
        this.a = playerNotificationManager;
    }
}
