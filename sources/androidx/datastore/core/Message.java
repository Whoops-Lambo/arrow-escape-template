package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.gv;
import defpackage.sy;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/datastore/core/Message;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Read", "Update", "Landroidx/datastore/core/Message$Read;", "Landroidx/datastore/core/Message$Update;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Message<T> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/Message$Read;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Message;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Read<T> extends Message<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/Message$Update;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Message;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Update<T> extends Message<T> {
        public final zr0 a;
        public final gv b;
        public final State c;
        public final sy d;

        public Update(zr0 zr0Var, gv gvVar, State state, sy syVar) {
            syVar.getClass();
            this.a = zr0Var;
            this.b = gvVar;
            this.c = state;
            this.d = syVar;
        }
    }
}
