package com.farimarwat.grizzly.crashmonitor;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/farimarwat/grizzly/crashmonitor/CustomExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "mFirebaseCrashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "getMFirebaseCrashlytics", "()Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", NotificationCompat.CATEGORY_MESSAGE, "", "getMsg", "()Ljava/lang/String;", "normalCrashEnabled", "", "getNormalCrashEnabled", "()Z", "title", "getTitle", "grizzly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CustomExceptionHandler extends Thread.UncaughtExceptionHandler {
    @NotNull
    Context getContext();

    @Nullable
    FirebaseCrashlytics getMFirebaseCrashlytics();

    @NotNull
    String getMsg();

    boolean getNormalCrashEnabled();

    @NotNull
    String getTitle();
}
