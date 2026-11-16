package androidx.work.impl.utils;

import android.app.Application;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001R\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/work/impl/utils/Api28Impl;", "", "", "a", "()Ljava/lang/String;", "processName", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class Api28Impl {
    public static final Api28Impl a = new Api28Impl();

    @DoNotInline
    @NotNull
    public final String a() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }
}
