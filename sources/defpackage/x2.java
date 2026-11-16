package defpackage;

import android.app.Person;
import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class x2 {
    public static /* bridge */ /* synthetic */ Person e(Object obj) {
        return (Person) obj;
    }

    public static /* bridge */ /* synthetic */ PrecomputedText j(Object obj) {
        return (PrecomputedText) obj;
    }

    public static /* synthetic */ void r(int i, int i2, String str) {
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof PrecomputedText;
    }
}
