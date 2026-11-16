package androidx.appcompat.app;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class TwilightManager {
    public static TwilightManager d;
    public final Context a;
    public final LocationManager b;
    public final TwilightState c = new TwilightState();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class TwilightState {
        public boolean a;
        public long b;
    }

    public TwilightManager(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }
}
