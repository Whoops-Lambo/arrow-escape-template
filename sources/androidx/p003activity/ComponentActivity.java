package androidx.p003activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.p003activity.ComponentActivity;
import androidx.p003activity.contextaware.ContextAware;
import androidx.p003activity.contextaware.ContextAwareHelper;
import androidx.p003activity.contextaware.OnContextAvailableListener;
import androidx.p003activity.result.ActivityResultCallback;
import androidx.p003activity.result.ActivityResultCaller;
import androidx.p003activity.result.ActivityResultLauncher;
import androidx.p003activity.result.ActivityResultRegistry;
import androidx.p003activity.result.ActivityResultRegistryOwner;
import androidx.p003activity.result.IntentSenderRequest;
import androidx.p003activity.result.contract.ActivityResultContract;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.tracing.Trace;
import com.applovin.sdk.AppLovinEventTypes;
import com.ecffri.arrows.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4664b4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.utils.Logger;
import defpackage.cm2;
import defpackage.d;
import defpackage.e32;
import defpackage.gd1;
import defpackage.nj;
import defpackage.os2;
import defpackage.rv;
import defpackage.s71;
import defpackage.tv;
import defpackage.vv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 Ø\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u0011:\nÙ\u0001Ø\u0001Ú\u0001Û\u0001Ü\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u00162\b\b\u0001\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u001f\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\u001f\u0010#J#\u0010\u001f\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b\u001f\u0010&J#\u0010'\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0016H\u0017¢\u0006\u0004\b(\u0010\u0013J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b0\u0010/J)\u00105\u001a\u0002042\u0006\u00101\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u0002042\u0006\u00101\u001a\u00020\u001d2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u0002042\u0006\u00101\u001a\u00020\u001d2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u001d2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00162\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010A\u001a\u00020\u00162\u0006\u0010@\u001a\u00020?2\u0006\u0010C\u001a\u00020\u0003H\u0016¢\u0006\u0004\bA\u0010DJ'\u0010A\u001a\u00020\u00162\u0006\u0010@\u001a\u00020?2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010F\u001a\u00020EH\u0017¢\u0006\u0004\bA\u0010GJ\u0017\u0010H\u001a\u00020\u00162\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bH\u0010BJ\u000f\u0010I\u001a\u00020\u0016H\u0016¢\u0006\u0004\bI\u0010\u0013J\u000f\u0010J\u001a\u00020\u0016H\u0017¢\u0006\u0004\bJ\u0010\u0013J\u001f\u0010N\u001a\u00020\u00162\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u001dH\u0017¢\u0006\u0004\bN\u0010OJ)\u0010N\u001a\u00020\u00162\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u001d2\b\u0010P\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\bN\u0010QJA\u0010W\u001a\u00020\u00162\u0006\u0010L\u001a\u00020R2\u0006\u0010M\u001a\u00020\u001d2\b\u0010S\u001a\u0004\u0018\u00010K2\u0006\u0010T\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020\u001d2\u0006\u0010V\u001a\u00020\u001dH\u0017¢\u0006\u0004\bW\u0010XJK\u0010W\u001a\u00020\u00162\u0006\u0010L\u001a\u00020R2\u0006\u0010M\u001a\u00020\u001d2\b\u0010S\u001a\u0004\u0018\u00010K2\u0006\u0010T\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020\u001d2\u0006\u0010V\u001a\u00020\u001d2\b\u0010P\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\bW\u0010YJ)\u0010\\\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010Z\u001a\u00020\u001d2\b\u0010[\u001a\u0004\u0018\u00010KH\u0015¢\u0006\u0004\b\\\u0010]J-\u0010c\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u001d2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010dJI\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000m\"\u0004\b\u0000\u0010e\"\u0004\b\u0001\u0010f2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010g2\u0006\u0010j\u001a\u00020i2\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00010k¢\u0006\u0004\bn\u0010oJA\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000m\"\u0004\b\u0000\u0010e\"\u0004\b\u0001\u0010f2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010g2\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00010k¢\u0006\u0004\bn\u0010pJ\u0017\u0010s\u001a\u00020\u00162\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0004\bs\u0010tJ\u001b\u0010v\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bv\u0010wJ\u001b\u0010x\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bx\u0010wJ\u0017\u0010z\u001a\u00020\u00162\u0006\u0010y\u001a\u00020\u001dH\u0017¢\u0006\u0004\bz\u0010 J\u001b\u0010{\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0u¢\u0006\u0004\b{\u0010wJ\u001b\u0010|\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0u¢\u0006\u0004\b|\u0010wJ\u0017\u0010}\u001a\u00020\u00162\u0006\u0010L\u001a\u00020KH\u0015¢\u0006\u0004\b}\u0010~J\u001b\u0010\u007f\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020K0u¢\u0006\u0004\b\u007f\u0010wJ\u001d\u0010\u0080\u0001\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020K0u¢\u0006\u0005\b\u0080\u0001\u0010wJ\u001b\u0010\u0082\u0001\u001a\u00020\u00162\u0007\u0010\u0081\u0001\u001a\u000204H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J#\u0010\u0082\u0001\u001a\u00020\u00162\u0007\u0010\u0081\u0001\u001a\u0002042\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0084\u0001J\u001e\u0010\u0086\u0001\u001a\u00020\u00162\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010u¢\u0006\u0005\b\u0086\u0001\u0010wJ\u001e\u0010\u0087\u0001\u001a\u00020\u00162\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010u¢\u0006\u0005\b\u0087\u0001\u0010wJ\u001b\u0010\u0089\u0001\u001a\u00020\u00162\u0007\u0010\u0088\u0001\u001a\u000204H\u0017¢\u0006\u0006\b\u0089\u0001\u0010\u0083\u0001J#\u0010\u0089\u0001\u001a\u00020\u00162\u0007\u0010\u0088\u0001\u001a\u0002042\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0089\u0001\u0010\u0084\u0001J\u001e\u0010\u008b\u0001\u001a\u00020\u00162\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010u¢\u0006\u0005\b\u008b\u0001\u0010wJ\u001e\u0010\u008c\u0001\u001a\u00020\u00162\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010u¢\u0006\u0005\b\u008c\u0001\u0010wJ\u0011\u0010\u008d\u0001\u001a\u00020\u0016H\u0015¢\u0006\u0005\b\u008d\u0001\u0010\u0013J\u0019\u0010\u008f\u0001\u001a\u00020\u00162\u0007\u0010-\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0019\u0010\u0091\u0001\u001a\u00020\u00162\u0007\u0010-\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0090\u0001J\u0011\u0010\u0092\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u0092\u0001\u0010\u0013R\u0018\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001f\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u0012\u0005\b\u009c\u0001\u0010\u0013R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¡\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R!\u0010¨\u0001\u001a\u00030£\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010©\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b©\u0001\u0010eR\u0018\u0010«\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001c\u0010\u00ad\u0001\u001a\u00020i8\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R$\u0010²\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R$\u0010´\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010³\u0001R$\u0010µ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010³\u0001R%\u0010¶\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010³\u0001R%\u0010·\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010u0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010³\u0001R\u001f\u0010¸\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010³\u0001R\u0019\u0010¹\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0019\u0010»\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010º\u0001R!\u0010À\u0001\u001a\u00030¼\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b½\u0001\u0010¥\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R(\u0010Æ\u0001\u001a\u00030Á\u00018FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\bÂ\u0001\u0010¥\u0001\u0012\u0005\bÅ\u0001\u0010\u0013\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010È\u0001\u001a\u0004\u0018\u00010\u00198WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010\u001bR\u0018\u0010Ì\u0001\u001a\u00030É\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Ï\u0001\u001a\u00030\u009d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ð\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0015\u0010×\u0001\u001a\u00030Ô\u00018F¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001¨\u0006Ý\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "Landroidx/activity/contextaware/ContextAware;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/activity/result/ActivityResultRegistryOwner;", "Landroidx/activity/result/ActivityResultCaller;", "Landroidx/core/content/OnConfigurationChangedProvider;", "Landroidx/core/content/OnTrimMemoryProvider;", "Landroidx/core/app/OnNewIntentProvider;", "Landroidx/core/app/OnMultiWindowModeChangedProvider;", "Landroidx/core/app/OnPictureInPictureModeChangedProvider;", "Landroidx/core/app/OnUserLeaveHintProvider;", "Landroidx/core/view/MenuHost;", "Landroidx/activity/FullyDrawnReporterOwner;", "<init>", "()V", "Landroid/os/Bundle;", "outState", "Laz2;", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Landroidx/activity/contextaware/OnContextAvailableListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnContextAvailableListener", "(Landroidx/activity/contextaware/OnContextAvailableListener;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/MenuProvider;", IronSourceConstants.EVENTS_PROVIDER, "addMenuProvider", "(Landroidx/core/view/MenuProvider;)V", "owner", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$State;", "state", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", C4664b4.f.f, "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultRegistry;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/core/util/Consumer;", "addOnConfigurationChangedListener", "(Landroidx/core/util/Consumer;)V", "removeOnConfigurationChangedListener", AppLovinEventTypes.USER_COMPLETED_LEVEL, "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/MultiWindowModeChangedInfo;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/PictureInPictureModeChangedInfo;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Landroidx/activity/contextaware/ContextAwareHelper;", "contextAwareHelper", "Landroidx/activity/contextaware/ContextAwareHelper;", "Landroidx/core/view/MenuHostHelper;", "menuHostHelper", "Landroidx/core/view/MenuHostHelper;", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/ViewModelStore;", "_viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter$delegate", "Lgd1;", "getFullyDrawnReporter", "()Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter", "contentLayoutId", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "getActivityResultRegistry", "()Landroidx/activity/result/ActivityResultRegistry;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Companion", "Api33Impl", "NonConfigurationInstances", "ReportFullyDrawnExecutor", "ReportFullyDrawnExecutorImpl", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, MenuHost, FullyDrawnReporterOwner {

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @NotNull
    private static final Companion Companion = new Companion();
    public static final /* synthetic */ int a = 0;

    @Nullable
    private ViewModelStore _viewModelStore;

    @NotNull
    private final ActivityResultRegistry activityResultRegistry;

    @LayoutRes
    private int contentLayoutId;

    @NotNull
    private final ContextAwareHelper contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final gd1 defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    @NotNull
    private final gd1 fullyDrawnReporter;

    @NotNull
    private final MenuHostHelper menuHostHelper;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final gd1 onBackPressedDispatcher;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;

    @NotNull
    private final SavedStateRegistryController savedStateRegistryController;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/ComponentActivity$Companion;", "", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/ComponentActivity$NonConfigurationInstances;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NonConfigurationInstances {
        public Object a;
        public ViewModelStore b;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Ljava/util/concurrent/Executor;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ReportFullyDrawnExecutor extends Executor {
        void f(View view);

        void q();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutorImpl;", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ReportFullyDrawnExecutorImpl implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {
        public final long a = SystemClock.uptimeMillis() + 10000;
        public Runnable b;
        public boolean c;

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public final void f(View view) {
            if (this.c) {
                return;
            }
            this.c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z;
            ComponentActivity componentActivity = ComponentActivity.this;
            Runnable runnable = this.b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.a) {
                    this.c = false;
                    componentActivity.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.b = null;
            FullyDrawnReporter fullyDrawnReporter = componentActivity.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.c) {
                z = fullyDrawnReporter.f;
            }
            if (z) {
                this.c = false;
                componentActivity.getWindow().getDecorView().post(this);
            }
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public final void q() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public ReportFullyDrawnExecutorImpl() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            this.b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            decorView.getClass();
            if (this.c) {
                if (s71.b(Looper.myLooper(), Looper.getMainLooper())) {
                    decorView.invalidate();
                    return;
                } else {
                    decorView.postInvalidate();
                    return;
                }
            }
            decorView.postOnAnimation(new b(this, 0));
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        super.startActivityForResult(p1, p2);
    }

    public static void safedk_Activity_startActivityForResult_9f44e908bf9d747fc527dbfa22dc7b4d(Activity p0, Intent p1, int p2, Bundle p3) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V");
        if (p1 == null) {
            return;
        }
        super.startActivityForResult(p1, p2, p3);
    }

    @Nullable
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/ComponentActivity$Api33Impl;", "", "Landroid/app/Activity;", "activity", "Landroid/window/OnBackInvokedDispatcher;", "a", "(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {
        public static final Api33Impl a = new Api33Impl();

        @DoNotInline
        @NotNull
        public final OnBackInvokedDispatcher a(@NotNull Activity activity) {
            activity.getClass();
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            return onBackInvokedDispatcher;
        }
    }

    public static final void access$ensureViewModelStore(ComponentActivity componentActivity) {
        if (componentActivity._viewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) componentActivity.getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                componentActivity._viewModelStore = nonConfigurationInstances.b;
            }
            if (componentActivity._viewModelStore == null) {
                componentActivity._viewModelStore = new ViewModelStore();
            }
        }
    }

    public static void f(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.q();
        }
    }

    public static Bundle g(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        ActivityResultRegistry activityResultRegistry = componentActivity.activityResultRegistry;
        activityResultRegistry.getClass();
        LinkedHashMap linkedHashMap = activityResultRegistry.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(activityResultRegistry.g));
        return bundle;
    }

    @Override // androidx.p003activity.result.ActivityResultRegistryOwner
    @NotNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @CallSuper
    @NotNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = mutableCreationExtras.a;
        if (application != null) {
            CreationExtras.Key key = ViewModelProvider.AndroidViewModelFactory.e;
            Application application2 = getApplication();
            application2.getClass();
            linkedHashMap.put(key, application2);
        }
        linkedHashMap.put(SavedStateHandleSupport.a, this);
        linkedHashMap.put(SavedStateHandleSupport.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(SavedStateHandleSupport.c, extras);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NotNull
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider.Factory) this.defaultViewModelProviderFactory.getValue();
    }

    @Override // androidx.p003activity.FullyDrawnReporterOwner
    @NotNull
    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter) this.fullyDrawnReporter.getValue();
    }

    @Override // androidx.p003activity.OnBackPressedDispatcherOwner
    @NotNull
    /* JADX INFO: renamed from: getOnBackPressedDispatcher */
    public final OnBackPressedDispatcher getC() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NotNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // android.app.Activity
    @CallSuper
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (this.activityResultRegistry.b(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        contextAwareHelper.b = this;
        Iterator it = contextAwareHelper.a.iterator();
        while (it.hasNext()) {
            ((OnContextAvailableListener) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = ReportFragment.b;
        ReportFragment.Companion.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public ComponentActivity() {
        this.contextAwareHelper = new ContextAwareHelper();
        this.menuHostHelper = new MenuHostHelper(new rv(this, 0));
        SavedStateRegistryController savedStateRegistryController = new SavedStateRegistryController(this);
        this.savedStateRegistryController = savedStateRegistryController;
        this.reportFullyDrawnExecutor = new ReportFullyDrawnExecutorImpl();
        this.fullyDrawnReporter = new cm2(new ComponentActivity$fullyDrawnReporter$2(this));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.activity.ComponentActivity$activityResultRegistry$1
            public static void safedk_ComponentActivity_startActivityForResult_e42adb0e2f1f6ab5a31f68e8cb5ca256(ComponentActivity p0, Intent p1, int p2, Bundle p3) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V");
                if (p1 == null) {
                    return;
                }
                p0.startActivityForResult(p1, p2, p3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.p003activity.result.ActivityResultRegistry
            public final void c(int i, ActivityResultContract activityResultContract, Object obj) {
                Bundle bundleExtra;
                int i2;
                String[] strArr;
                activityResultContract.getClass();
                ComponentActivity componentActivity = this.h;
                ActivityResultContract.SynchronousResult synchronousResultB = activityResultContract.b(componentActivity, obj);
                if (synchronousResultB != null) {
                    new Handler(Looper.getMainLooper()).post(new vv(this, i, synchronousResultB, 0));
                    return;
                }
                Intent intentA = activityResultContract.a(componentActivity, obj);
                if (intentA.getExtras() != null) {
                    Bundle extras = intentA.getExtras();
                    extras.getClass();
                    if (extras.getClassLoader() == null) {
                        intentA.setExtrasClassLoader(componentActivity.getClassLoader());
                    }
                }
                if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                } else {
                    bundleExtra = null;
                }
                Bundle bundle = bundleExtra;
                if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                    String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    HashSet hashSet = new HashSet();
                    for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                        if (!TextUtils.isEmpty(stringArrayExtra[i3])) {
                            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                                hashSet.add(Integer.valueOf(i3));
                            }
                        } else {
                            d.r(nj.q(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                            return;
                        }
                    }
                    int size = hashSet.size();
                    if (size > 0) {
                        strArr = new String[stringArrayExtra.length - size];
                    } else {
                        strArr = stringArrayExtra;
                    }
                    if (size > 0) {
                        if (size == stringArrayExtra.length) {
                            return;
                        }
                        int i4 = 0;
                        for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                            if (!hashSet.contains(Integer.valueOf(i5))) {
                                strArr[i4] = stringArrayExtra[i5];
                                i4++;
                            }
                        }
                    }
                    if (componentActivity instanceof ActivityCompat.RequestPermissionsRequestCodeValidator) {
                        ((ActivityCompat.RequestPermissionsRequestCodeValidator) componentActivity).validateRequestPermissionsRequestCode(i);
                    }
                    componentActivity.requestPermissions(stringArrayExtra, i);
                    return;
                }
                if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                    IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
                        intentSenderRequest.getClass();
                        i2 = i;
                        try {
                            componentActivity.startIntentSenderForResult(intentSenderRequest.a, i2, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle);
                        } catch (IntentSender.SendIntentException e) {
                            e = e;
                            new Handler(Looper.getMainLooper()).post(new vv(this, i2, e, 1));
                        }
                    } catch (IntentSender.SendIntentException e2) {
                        e = e2;
                        i2 = i;
                    }
                } else {
                    safedk_ComponentActivity_startActivityForResult_e42adb0e2f1f6ab5a31f68e8cb5ca256(componentActivity, intentA, i, bundle);
                }
            }
        };
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            final int i = 0;
            getLifecycle().a(new LifecycleEventObserver(this) { // from class: sv
                public final /* synthetic */ ComponentActivity b;

                {
                    this.b = this;
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    Window window;
                    View viewPeekDecorView;
                    int i2 = i;
                    ComponentActivity componentActivity = this.b;
                    switch (i2) {
                        case 0:
                            int i3 = ComponentActivity.a;
                            if (event == Lifecycle.Event.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                                viewPeekDecorView.cancelPendingInputEvents();
                                break;
                            }
                            break;
                        default:
                            ComponentActivity.f(componentActivity, lifecycleOwner, event);
                            break;
                    }
                }
            });
            final int i2 = 1;
            getLifecycle().a(new LifecycleEventObserver(this) { // from class: sv
                public final /* synthetic */ ComponentActivity b;

                {
                    this.b = this;
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    Window window;
                    View viewPeekDecorView;
                    int i3 = i2;
                    ComponentActivity componentActivity = this.b;
                    switch (i3) {
                        case 0:
                            int i4 = ComponentActivity.a;
                            if (event == Lifecycle.Event.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                                viewPeekDecorView.cancelPendingInputEvents();
                                break;
                            }
                            break;
                        default:
                            ComponentActivity.f(componentActivity, lifecycleOwner, event);
                            break;
                    }
                }
            });
            getLifecycle().a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ComponentActivity componentActivity = ComponentActivity.this;
                    ComponentActivity.access$ensureViewModelStore(componentActivity);
                    componentActivity.getLifecycle().c(this);
                }
            });
            savedStateRegistryController.a();
            SavedStateHandleSupport.b(this);
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new tv(this, 0));
            addOnContextAvailableListener(new OnContextAvailableListener() { // from class: uv
                @Override // androidx.p003activity.contextaware.OnContextAvailableListener
                public final void a(ComponentActivity componentActivity) {
                    ComponentActivity.e(this.a, componentActivity);
                }
            });
            this.defaultViewModelProviderFactory = new cm2(new ComponentActivity$defaultViewModelProviderFactory$2(this));
            this.onBackPressedDispatcher = new cm2(new ComponentActivity$onBackPressedDispatcher$2(this));
            return;
        }
        e32.i("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        throw null;
    }

    public static void e(ComponentActivity componentActivity, Context context) {
        context.getClass();
        Bundle bundleA = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            ActivityResultRegistry activityResultRegistry = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = activityResultRegistry.b;
            LinkedHashMap linkedHashMap2 = activityResultRegistry.a;
            Bundle bundle = activityResultRegistry.g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    activityResultRegistry.d.addAll(stringArrayList2);
                }
                Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = stringArrayList.get(i);
                    if (linkedHashMap.containsKey(str)) {
                        Integer num = (Integer) linkedHashMap.remove(str);
                        if (!bundle.containsKey(str)) {
                            os2.h(linkedHashMap2).remove(num);
                        }
                    }
                    Integer num2 = integerArrayList.get(i);
                    num2.getClass();
                    int iIntValue = num2.intValue();
                    String str2 = stringArrayList.get(i);
                    str2.getClass();
                    String str3 = str2;
                    linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                    activityResultRegistry.b.put(str3, Integer.valueOf(iIntValue));
                }
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        reportFullyDrawnExecutor.f(decorView);
        super.addContentView(view, params);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@NotNull MenuProvider provider) {
        provider.getClass();
        MenuHostHelper menuHostHelper = this.menuHostHelper;
        menuHostHelper.b.add(provider);
        menuHostHelper.a.run();
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(@NotNull Consumer<Configuration> listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        listener.getClass();
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        ComponentActivity componentActivity = contextAwareHelper.b;
        if (componentActivity != null) {
            listener.a(componentActivity);
        }
        contextAwareHelper.a.add(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(@NotNull Consumer<MultiWindowModeChangedInfo> listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(@NotNull Consumer<Intent> listener) {
        listener.getClass();
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(@NotNull Consumer<PictureInPictureModeChangedInfo> listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(@NotNull Consumer<Integer> listener) {
        listener.getClass();
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(@NotNull Runnable listener) {
        listener.getClass();
        this.onUserLeaveHintListeners.add(listener);
    }

    @Nullable
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NotNull
    public ViewModelStore getViewModelStore() {
        if (getApplication() != null) {
            if (this._viewModelStore == null) {
                NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
                if (nonConfigurationInstances != null) {
                    this._viewModelStore = nonConfigurationInstances.b;
                }
                if (this._viewModelStore == null) {
                    this._viewModelStore = new ViewModelStore();
                }
            }
            ViewModelStore viewModelStore = this._viewModelStore;
            viewModelStore.getClass();
            return viewModelStore;
        }
        e32.i("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @CallSuper
    @MainThread
    public void onBackPressed() {
        getC().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, @NotNull Menu menu) {
        menu.getClass();
        if (featureId == 0) {
            super.onCreatePanelMenu(featureId, menu);
            MenuHostHelper menuHostHelper = this.menuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator it = menuHostHelper.b.iterator();
            while (it.hasNext()) {
                ((MenuProvider) it.next()).a(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @NotNull MenuItem item) {
        item.getClass();
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            Iterator it = this.menuHostHelper.b.iterator();
            while (it.hasNext()) {
                if (((MenuProvider) it.next()).d(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @RequiresApi
    @CallSuper
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, @NotNull Configuration newConfig) {
        newConfig.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(isInMultiWindowMode));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@NotNull Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, @NotNull Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).b(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    @RequiresApi
    @CallSuper
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @NotNull Configuration newConfig) {
        newConfig.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(isInPictureInPictureMode));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, @Nullable View view, @NotNull Menu menu) {
        menu.getClass();
        if (featureId == 0) {
            super.onPreparePanel(featureId, view, menu);
            Iterator it = this.menuHostHelper.b.iterator();
            while (it.hasNext()) {
                ((MenuProvider) it.next()).c(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        if (!this.activityResultRegistry.b(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.b;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.a = objOnRetainCustomNonConfigurationInstance;
        nonConfigurationInstances2.b = viewModelStore;
        return nonConfigurationInstances2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NotNull Bundle outState) {
        outState.getClass();
        if (getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle = getLifecycle();
            lifecycle.getClass();
            ((LifecycleRegistry) lifecycle).h(Lifecycle.State.c);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @NotNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NotNull ActivityResultContract<I, O> contract, @NotNull ActivityResultRegistry registry, @NotNull ActivityResultCallback<O> callback) {
        contract.getClass();
        registry.getClass();
        callback.getClass();
        return registry.d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(@NotNull MenuProvider provider) {
        provider.getClass();
        this.menuHostHelper.c(provider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(@NotNull Consumer<Configuration> listener) {
        listener.getClass();
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        listener.getClass();
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        contextAwareHelper.a.remove(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(@NotNull Consumer<MultiWindowModeChangedInfo> listener) {
        listener.getClass();
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(@NotNull Consumer<Intent> listener) {
        listener.getClass();
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(@NotNull Consumer<PictureInPictureModeChangedInfo> listener) {
        listener.getClass();
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(@NotNull Consumer<Integer> listener) {
        listener.getClass();
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(@NotNull Runnable listener) {
        listener.getClass();
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.b()) {
                Trace.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int layoutResID) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        reportFullyDrawnExecutor.f(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@NotNull Intent intent, int requestCode) {
        intent.getClass();
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, intent, requestCode);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@NotNull Intent intent, int requestCode, @Nullable Bundle options) {
        intent.getClass();
        safedk_Activity_startActivityForResult_9f44e908bf9d747fc527dbfa22dc7b4d(this, intent, requestCode, options);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, @Nullable Bundle options) throws IntentSender.SendIntentException {
        intent.getClass();
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public void addMenuProvider(@NotNull MenuProvider provider, @NotNull LifecycleOwner owner) {
        provider.getClass();
        owner.getClass();
        this.menuHostHelper.a(provider, owner);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NotNull MenuProvider provider, @NotNull LifecycleOwner owner, @NotNull Lifecycle.State state) {
        provider.getClass();
        owner.getClass();
        state.getClass();
        this.menuHostHelper.b(provider, owner, state);
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        reportFullyDrawnExecutor.f(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        reportFullyDrawnExecutor.f(decorView);
        super.setContentView(view, params);
    }

    @NotNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NotNull ActivityResultContract<I, O> contract, @NotNull ActivityResultCallback<O> callback) {
        contract.getClass();
        callback.getClass();
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(isInPictureInPictureMode));
        }
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }
}
