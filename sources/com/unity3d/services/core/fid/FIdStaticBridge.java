package com.unity3d.services.core.fid;

import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, d2 = {"Lcom/unity3d/services/core/fid/FIdStaticBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "<init>", "()V", Constants.GET_INSTANCE, "Lcom/unity3d/services/core/fid/FIdBridge;", "context", "Landroid/content/Context;", "getClassName", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FIdStaticBridge extends GenericBridge {
    /* JADX WARN: Illegal instructions before constructor call */
    public FIdStaticBridge() {
        Map mapSingletonMap = Collections.singletonMap(Constants.GET_INSTANCE, new Class[]{Context.class});
        mapSingletonMap.getClass();
        super(mapSingletonMap, false);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return Constants.INSTANCE.getClassName();
    }

    @Nullable
    public final FIdBridge getInstance(@NotNull Context context) {
        context.getClass();
        Object objCallNonVoidMethod = callNonVoidMethod(Constants.GET_INSTANCE, null, context);
        if (objCallNonVoidMethod == null) {
            return null;
        }
        return new FIdBridge(objCallNonVoidMethod);
    }
}
