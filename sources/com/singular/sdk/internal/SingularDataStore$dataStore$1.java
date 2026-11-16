package com.singular.sdk.internal;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import defpackage.rc1;
import defpackage.sr0;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SingularDataStore$dataStore$1 extends rc1 implements sr0 {
    final /* synthetic */ SingularDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingularDataStore$dataStore$1(SingularDataStore singularDataStore) {
        super(0);
        this.this$0 = singularDataStore;
    }

    @Override // defpackage.sr0
    @NotNull
    public final File invoke() {
        Context context = this.this$0.appContext;
        context.getClass();
        String str = this.this$0.name;
        str.getClass();
        return DataStoreFile.a(context, str.concat(".preferences_pb"));
    }
}
