package com.unity3d.services.core.fid;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C5074y2;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/services/core/fid/FIdBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", C5074y2.p, "", "<init>", "(Ljava/lang/Object;)V", "getClassName", "", Constants.GET_APP_INSTANCE_ID, "Lcom/google/android/gms/tasks/Task;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FIdBridge extends GenericBridge {

    @NotNull
    private final Object instance;

    @NotNull
    public final Task<String> getAppInstanceId() {
        Task<String> task = (Task) callNonVoidMethod(Constants.GET_APP_INSTANCE_ID, this.instance, new Object[0]);
        if (task != null) {
            return task;
        }
        Task<String> taskForResult = Tasks.forResult(null);
        taskForResult.getClass();
        return taskForResult;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return Constants.INSTANCE.getClassName();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FIdBridge(@NotNull Object obj) {
        obj.getClass();
        Map mapSingletonMap = Collections.singletonMap(Constants.GET_APP_INSTANCE_ID, new Class[0]);
        mapSingletonMap.getClass();
        super(mapSingletonMap, false);
        this.instance = obj;
    }
}
