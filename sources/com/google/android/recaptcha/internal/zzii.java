package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.dt1;
import defpackage.qh1;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzii implements zzih {

    @NotNull
    private final Context zza;

    @NotNull
    private final Map zzb = qh1.Y(new dt1(2, Context.ACTIVITY_SERVICE), new dt1(3, Context.TELEPHONY_SERVICE), new dt1(4, Context.INPUT_METHOD_SERVICE), new dt1(5, Context.AUDIO_SERVICE));

    @Override // com.google.android.recaptcha.internal.zzih
    @Nullable
    public final Object zza(@NotNull Object... objArr) throws zzce {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            y.e(4, 5, null);
            return null;
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzce(4, 4, null);
    }

    public zzii(@NotNull Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }
}
