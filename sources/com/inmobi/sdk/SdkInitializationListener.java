package com.inmobi.sdk;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.inmobi.media.C4388sk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/inmobi/sdk/SdkInitializationListener;", "", "Ljava/lang/Error;", "Lkotlin/Error;", "error", "Laz2;", "onInitializationComplete", "(Ljava/lang/Error;)V", "Companion", "com/inmobi/media/sk", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SdkInitializationListener {

    @NotNull
    public static final String ACCOUNT_ID_DIFFERENT = "SDK initialization with a different account ID is not allowed. To use a different account ID, please contact InMobi Customer Support.";

    @NotNull
    public static final String ACCOUNT_ID_MISMATCH = "SDK is already initializing or initialized with a different account ID.";

    @NotNull
    public static final C4388sk Companion = C4388sk.a;

    @NotNull
    public static final String INIT_IN_PROGRESS = "SDK initialization is already in progress. Please wait for the current initialization to complete.";

    @NotNull
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";

    @NotNull
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";

    @NotNull
    public static final String MISSING_CONTEXT = "Context cannot be null. Please provide a valid context object.";

    @NotNull
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";

    @NotNull
    public static final String MISSING_WEBVIEW_DEPENDENCY = "SDK could not be initialized; Required WebView dependency could not be found.";

    @NotNull
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";

    @UiThread
    void onInitializationComplete(@Nullable Error error);
}
