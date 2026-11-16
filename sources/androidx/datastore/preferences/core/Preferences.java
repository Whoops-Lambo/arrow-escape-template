package androidx.datastore.preferences.core;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.s71;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/preferences/core/Preferences;", "", "Key", "Pair", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Preferences {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Key;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Key<T> {
        public final String a;

        public final boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            return s71.b(this.a, ((Key) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        /* JADX INFO: renamed from: toString, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public Key(String str) {
            str.getClass();
            this.a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Pair;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pair<T> {
    }

    public abstract Map a();

    public abstract Object b(Key key);

    public final MutablePreferences c() {
        return new MutablePreferences(new LinkedHashMap(a()), false);
    }
}
