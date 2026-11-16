package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import defpackage.cm2;
import defpackage.gd1;
import defpackage.j52;
import defpackage.s5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u001d\u0010\f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidGoogleAppIdDataSource;", "Lcom/unity3d/ads/core/data/datasource/GoogleAppIdDataSource;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Context;", "", "googleAppId$delegate", "Lgd1;", "getGoogleAppId", "()Ljava/lang/String;", "googleAppId", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidGoogleAppIdDataSource implements GoogleAppIdDataSource {

    @NotNull
    public static final String GOOGLE_APP_ID_RESOURCE_NAME = "google_app_id";

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: googleAppId$delegate, reason: from kotlin metadata */
    @NotNull
    private final gd1 googleAppId;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String googleAppId_delegate$lambda$3(AndroidGoogleAppIdDataSource androidGoogleAppIdDataSource) {
        Object j52Var;
        try {
            j52Var = Integer.valueOf(androidGoogleAppIdDataSource.context.getResources().getIdentifier(GOOGLE_APP_ID_RESOURCE_NAME, "string", androidGoogleAppIdDataSource.context.getPackageName()));
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        if (j52Var instanceof j52) {
            j52Var = null;
        }
        Integer num = (Integer) j52Var;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 0) {
            num = null;
        }
        if (num == null) {
            return null;
        }
        return androidGoogleAppIdDataSource.context.getString(num.intValue());
    }

    @Override // com.unity3d.ads.core.data.datasource.GoogleAppIdDataSource
    @Nullable
    public String getGoogleAppId() {
        return (String) this.googleAppId.getValue();
    }

    public AndroidGoogleAppIdDataSource(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.googleAppId = new cm2(new s5(this, 8));
    }
}
