package defpackage;

import com.ironsource.Ue;
import kotlin.Metadata;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpy0;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lokhttp3/Response;", Ue.n, "<init>", "(Lokhttp3/Response;)V", "a", "Lokhttp3/Response;", "getResponse", "()Lokhttp3/Response;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class py0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Response response;

    public py0(@NotNull Response response) {
        super("HTTP " + response.code() + ": " + response.message());
        this.response = response;
    }
}
