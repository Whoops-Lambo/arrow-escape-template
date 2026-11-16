package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/State;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "a", "I", "()I", "version", "Landroidx/datastore/core/Data;", "Landroidx/datastore/core/Final;", "Landroidx/datastore/core/ReadException;", "Landroidx/datastore/core/UnInitialized;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class State<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public State(int i) {
        this.version = i;
    }
}
