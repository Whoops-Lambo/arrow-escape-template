package defpackage;

import com.ironsource.C4664b4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lh21;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "headerValue", "", C4664b4.i.L, "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "getHeaderValue", "()Ljava/lang/String;", "b", "I", "getPosition", "()I", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h21 extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String headerValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int position;

    public h21(@NotNull String str, int i) {
        str.getClass();
        StringBuilder sb = new StringBuilder("Header value '");
        sb.append(str);
        sb.append("' contains illegal character '");
        sb.append(str.charAt(i));
        sb.append("' (code ");
        super(h50.l(sb, str.charAt(i) & 255, ')'));
        this.headerValue = str;
        this.position = i;
    }
}
