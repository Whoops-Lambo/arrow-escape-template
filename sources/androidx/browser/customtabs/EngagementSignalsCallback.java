package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface EngagementSignalsCallback {
    default void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
    }

    default void onSessionEnded(boolean z, Bundle bundle) {
    }

    default void onVerticalScrollEvent(boolean z, Bundle bundle) {
    }
}
