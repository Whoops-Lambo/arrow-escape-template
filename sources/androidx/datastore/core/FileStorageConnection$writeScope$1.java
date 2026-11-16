package androidx.datastore.core;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@t50(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "writeScope")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class FileStorageConnection$writeScope$1 extends fy {
    public FileStorageConnection r;
    public Object s;
    public Object t;
    public FileWriteScope u;
    public /* synthetic */ Object v;
    public final /* synthetic */ FileStorageConnection w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorageConnection$writeScope$1(FileStorageConnection fileStorageConnection, fy fyVar) {
        super(fyVar);
        this.w = fileStorageConnection;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
