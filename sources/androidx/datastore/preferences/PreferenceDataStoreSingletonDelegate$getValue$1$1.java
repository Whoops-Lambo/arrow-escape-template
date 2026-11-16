package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends rc1 implements sr0 {
    public final /* synthetic */ Context i;
    public final /* synthetic */ PreferenceDataStoreSingletonDelegate j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        super(0);
        this.i = context;
        this.j = preferenceDataStoreSingletonDelegate;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        return DataStoreFile.a(this.i, this.j.a.concat(".preferences_pb"));
    }
}
