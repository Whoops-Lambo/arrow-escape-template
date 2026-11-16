package androidx.datastore.preferences.core;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"datastore-preferences-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PreferencesFactory {
    public static final MutablePreferences a(Preferences.Pair... pairArr) {
        MutablePreferences mutablePreferences = new MutablePreferences(false);
        Preferences.Pair[] pairArr2 = (Preferences.Pair[]) Arrays.copyOf(pairArr, pairArr.length);
        mutablePreferences.d();
        if (pairArr2.length <= 0) {
            return mutablePreferences;
        }
        pairArr2[0].getClass();
        mutablePreferences.g(null, null);
        throw null;
    }
}
