package com.squareup.picasso;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import defpackage.d;
import defpackage.e32;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class RequestCreator {
    private static final AtomicInteger nextId = new AtomicInteger();
    private final Request.Builder data;
    private boolean deferred;
    private Drawable errorDrawable;
    private int errorResId;
    private int memoryPolicy;
    private int networkPolicy;
    private boolean noFade;
    private final Picasso picasso;
    private Drawable placeholderDrawable;
    private int placeholderResId;
    private boolean setPlaceholder;
    private Object tag;

    public RequestCreator clearTag() {
        this.tag = null;
        return this;
    }

    public RequestCreator fit() {
        this.deferred = true;
        return this;
    }

    public void into(ImageView imageView, Callback callback) {
        Bitmap bitmapQuickMemoryCacheCheck;
        long jNanoTime = System.nanoTime();
        Utils.checkMain();
        if (imageView == null) {
            d.r("Target must not be null.");
            return;
        }
        if (!this.data.hasImage()) {
            this.picasso.cancelRequest(imageView);
            if (this.setPlaceholder) {
                PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
                return;
            }
            return;
        }
        if (this.deferred) {
            if (this.data.hasSize()) {
                e32.i("Fit cannot be used with resize.");
                return;
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.setPlaceholder) {
                    PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
                }
                this.picasso.defer(imageView, new DeferredRequestCreator(this, imageView, callback));
                return;
            }
            this.data.resize(width, height);
        }
        Request requestCreateRequest = createRequest(jNanoTime);
        String strCreateKey = Utils.createKey(requestCreateRequest);
        if (!MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) || (bitmapQuickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(strCreateKey)) == null) {
            if (this.setPlaceholder) {
                PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
            }
            this.picasso.enqueueAndSubmit(new ImageViewAction(this.picasso, imageView, requestCreateRequest, this.memoryPolicy, this.networkPolicy, this.errorResId, this.errorDrawable, strCreateKey, this.tag, callback, this.noFade));
            return;
        }
        this.picasso.cancelRequest(imageView);
        Picasso picasso = this.picasso;
        Context context = picasso.context;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
        PicassoDrawable.setBitmap(imageView, context, bitmapQuickMemoryCacheCheck, loadedFrom, this.noFade, picasso.indicatorsEnabled);
        if (this.picasso.loggingEnabled) {
            Utils.log("Main", "completed", requestCreateRequest.plainId(), "from " + loadedFrom);
        }
        if (callback != null) {
            callback.onSuccess();
        }
    }

    public RequestCreator memoryPolicy(@NonNull MemoryPolicy memoryPolicy, @NonNull MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy == null) {
            d.r("Memory policy cannot be null.");
            return null;
        }
        this.memoryPolicy = memoryPolicy.index | this.memoryPolicy;
        if (memoryPolicyArr == null) {
            d.r("Memory policy cannot be null.");
            return null;
        }
        if (memoryPolicyArr.length > 0) {
            for (MemoryPolicy memoryPolicy2 : memoryPolicyArr) {
                if (memoryPolicy2 == null) {
                    d.r("Memory policy cannot be null.");
                    return null;
                }
                this.memoryPolicy = memoryPolicy2.index | this.memoryPolicy;
            }
        }
        return this;
    }

    public RequestCreator networkPolicy(@NonNull NetworkPolicy networkPolicy, @NonNull NetworkPolicy... networkPolicyArr) {
        if (networkPolicy == null) {
            d.r("Network policy cannot be null.");
            return null;
        }
        this.networkPolicy = networkPolicy.index | this.networkPolicy;
        if (networkPolicyArr == null) {
            d.r("Network policy cannot be null.");
            return null;
        }
        if (networkPolicyArr.length > 0) {
            for (NetworkPolicy networkPolicy2 : networkPolicyArr) {
                if (networkPolicy2 == null) {
                    d.r("Network policy cannot be null.");
                    return null;
                }
                this.networkPolicy = networkPolicy2.index | this.networkPolicy;
            }
        }
        return this;
    }

    public RequestCreator noFade() {
        this.noFade = true;
        return this;
    }

    public RequestCreator tag(@NonNull Object obj) {
        if (obj == null) {
            d.r("Tag invalid.");
            return null;
        }
        if (this.tag == null) {
            this.tag = obj;
            return this;
        }
        e32.i("Tag already set.");
        return null;
    }

    public RequestCreator unfit() {
        this.deferred = false;
        return this;
    }

    private Request createRequest(long j) {
        int andIncrement = nextId.getAndIncrement();
        Request requestBuild = this.data.build();
        requestBuild.id = andIncrement;
        requestBuild.started = j;
        boolean z = this.picasso.loggingEnabled;
        if (z) {
            Utils.log("Main", "created", requestBuild.plainId(), requestBuild.toString());
        }
        Request requestTransformRequest = this.picasso.transformRequest(requestBuild);
        if (requestTransformRequest != requestBuild) {
            requestTransformRequest.id = andIncrement;
            requestTransformRequest.started = j;
            if (z) {
                Utils.log("Main", "changed", requestTransformRequest.logId(), "into " + requestTransformRequest);
            }
        }
        return requestTransformRequest;
    }

    private Drawable getPlaceholderDrawable() {
        int i = this.placeholderResId;
        return i != 0 ? this.picasso.context.getDrawable(i) : this.placeholderDrawable;
    }

    private void performRemoteViewInto(RemoteViewsAction remoteViewsAction) {
        Bitmap bitmapQuickMemoryCacheCheck;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (bitmapQuickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(remoteViewsAction.getKey())) != null) {
            remoteViewsAction.complete(bitmapQuickMemoryCacheCheck, Picasso.LoadedFrom.MEMORY);
            return;
        }
        int i = this.placeholderResId;
        if (i != 0) {
            remoteViewsAction.setImageResource(i);
        }
        this.picasso.enqueueAndSubmit(remoteViewsAction);
    }

    public RequestCreator centerCrop() {
        this.data.centerCrop(17);
        return this;
    }

    public RequestCreator centerInside() {
        this.data.centerInside();
        return this;
    }

    public RequestCreator config(@NonNull Bitmap.Config config) {
        this.data.config(config);
        return this;
    }

    public RequestCreator error(@DrawableRes int i) {
        if (i == 0) {
            d.r("Error image resource invalid.");
            return null;
        }
        if (this.errorDrawable == null) {
            this.errorResId = i;
            return this;
        }
        e32.i("Error image already set.");
        return null;
    }

    public Object getTag() {
        return this.tag;
    }

    public RequestCreator noPlaceholder() {
        if (this.placeholderResId != 0) {
            e32.i("Placeholder resource already set.");
            return null;
        }
        if (this.placeholderDrawable == null) {
            this.setPlaceholder = false;
            return this;
        }
        e32.i("Placeholder image already set.");
        return null;
    }

    public RequestCreator onlyScaleDown() {
        this.data.onlyScaleDown();
        return this;
    }

    public RequestCreator placeholder(@DrawableRes int i) {
        if (!this.setPlaceholder) {
            e32.i("Already explicitly declared as no placeholder.");
            return null;
        }
        if (i == 0) {
            d.r("Placeholder image resource invalid.");
            return null;
        }
        if (this.placeholderDrawable == null) {
            this.placeholderResId = i;
            return this;
        }
        e32.i("Placeholder image already set.");
        return null;
    }

    public RequestCreator priority(@NonNull Picasso.Priority priority) {
        this.data.priority(priority);
        return this;
    }

    public RequestCreator purgeable() {
        this.data.purgeable();
        return this;
    }

    public RequestCreator resize(int i, int i2) {
        this.data.resize(i, i2);
        return this;
    }

    public RequestCreator resizeDimen(int i, int i2) {
        Resources resources = this.picasso.context.getResources();
        return resize(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i2));
    }

    public RequestCreator rotate(float f) {
        this.data.rotate(f);
        return this;
    }

    public RequestCreator stableKey(@NonNull String str) {
        this.data.stableKey(str);
        return this;
    }

    public RequestCreator transform(@NonNull Transformation transformation) {
        this.data.transform(transformation);
        return this;
    }

    public RequestCreator(Picasso picasso, Uri uri, int i) {
        this.setPlaceholder = true;
        if (!picasso.shutdown) {
            this.picasso = picasso;
            this.data = new Request.Builder(uri, i, picasso.defaultBitmapConfig);
        } else {
            e32.i("Picasso instance already shut down. Cannot submit new requests.");
            throw null;
        }
    }

    public void fetch(@Nullable Callback callback) {
        long jNanoTime = System.nanoTime();
        if (!this.deferred) {
            if (this.data.hasImage()) {
                if (!this.data.hasPriority()) {
                    this.data.priority(Picasso.Priority.LOW);
                }
                Request requestCreateRequest = createRequest(jNanoTime);
                String strCreateKey = Utils.createKey(requestCreateRequest, new StringBuilder());
                if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && this.picasso.quickMemoryCacheCheck(strCreateKey) != null) {
                    if (this.picasso.loggingEnabled) {
                        Utils.log("Main", "completed", requestCreateRequest.plainId(), "from " + Picasso.LoadedFrom.MEMORY);
                    }
                    if (callback != null) {
                        callback.onSuccess();
                        return;
                    }
                    return;
                }
                this.picasso.submit(new FetchAction(this.picasso, requestCreateRequest, this.memoryPolicy, this.networkPolicy, this.tag, strCreateKey, callback));
                return;
            }
            return;
        }
        e32.i("Fit cannot be used with fetch.");
    }

    public Bitmap get() throws IOException {
        long jNanoTime = System.nanoTime();
        Utils.checkNotMain();
        if (!this.deferred) {
            if (!this.data.hasImage()) {
                return null;
            }
            Request requestCreateRequest = createRequest(jNanoTime);
            GetAction getAction = new GetAction(this.picasso, requestCreateRequest, this.memoryPolicy, this.networkPolicy, this.tag, Utils.createKey(requestCreateRequest, new StringBuilder()));
            Picasso picasso = this.picasso;
            return BitmapHunter.forRequest(picasso, picasso.dispatcher, picasso.cache, picasso.stats, getAction).hunt();
        }
        e32.i("Fit cannot be used with get.");
        return null;
    }

    public RequestCreator rotate(float f, float f2, float f3) {
        this.data.rotate(f, f2, f3);
        return this;
    }

    public RequestCreator transform(@NonNull List<? extends Transformation> list) {
        this.data.transform(list);
        return this;
    }

    public RequestCreator centerCrop(int i) {
        this.data.centerCrop(i);
        return this;
    }

    public RequestCreator error(@NonNull Drawable drawable) {
        if (drawable != null) {
            if (this.errorResId == 0) {
                this.errorDrawable = drawable;
                return this;
            }
            e32.i("Error image already set.");
            return null;
        }
        d.r("Error image may not be null.");
        return null;
    }

    @VisibleForTesting
    public RequestCreator() {
        this.setPlaceholder = true;
        this.picasso = null;
        this.data = new Request.Builder(null, 0, null);
    }

    public RequestCreator placeholder(@NonNull Drawable drawable) {
        if (this.setPlaceholder) {
            if (this.placeholderResId == 0) {
                this.placeholderDrawable = drawable;
                return this;
            }
            e32.i("Placeholder image already set.");
            return null;
        }
        e32.i("Already explicitly declared as no placeholder.");
        return null;
    }

    public void fetch() {
        fetch(null);
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i, int i2, @NonNull Notification notification) {
        into(remoteViews, i, i2, notification, null);
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i, int i2, @NonNull Notification notification, @Nullable String str) {
        into(remoteViews, i, i2, notification, str, null);
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i, int i2, @NonNull Notification notification, @Nullable String str, Callback callback) {
        long jNanoTime = System.nanoTime();
        if (remoteViews == null) {
            d.r("RemoteViews must not be null.");
            return;
        }
        if (notification != null) {
            if (!this.deferred) {
                if (this.placeholderDrawable == null && this.placeholderResId == 0 && this.errorDrawable == null) {
                    Request requestCreateRequest = createRequest(jNanoTime);
                    performRemoteViewInto(new RemoteViewsAction.NotificationAction(this.picasso, requestCreateRequest, remoteViews, i, i2, notification, str, this.memoryPolicy, this.networkPolicy, Utils.createKey(requestCreateRequest, new StringBuilder()), this.tag, this.errorResId, callback));
                    return;
                }
                d.r("Cannot use placeholder or error drawables with remote views.");
                return;
            }
            e32.i("Fit cannot be used with RemoteViews.");
            return;
        }
        d.r("Notification must not be null.");
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i, @NonNull int[] iArr) {
        into(remoteViews, i, iArr, (Callback) null);
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i, @NonNull int[] iArr, Callback callback) {
        long jNanoTime = System.nanoTime();
        if (remoteViews == null) {
            d.r("remoteViews must not be null.");
            return;
        }
        if (iArr != null) {
            if (!this.deferred) {
                if (this.placeholderDrawable == null && this.placeholderResId == 0 && this.errorDrawable == null) {
                    Request requestCreateRequest = createRequest(jNanoTime);
                    performRemoteViewInto(new RemoteViewsAction.AppWidgetAction(this.picasso, requestCreateRequest, remoteViews, i, iArr, this.memoryPolicy, this.networkPolicy, Utils.createKey(requestCreateRequest, new StringBuilder()), this.tag, this.errorResId, callback));
                    return;
                }
                d.r("Cannot use placeholder or error drawables with remote views.");
                return;
            }
            e32.i("Fit cannot be used with remote views.");
            return;
        }
        d.r("appWidgetIds must not be null.");
    }

    public void into(ImageView imageView) {
        into(imageView, null);
    }

    public void into(@NonNull Target target) {
        Bitmap bitmapQuickMemoryCacheCheck;
        long jNanoTime = System.nanoTime();
        Utils.checkMain();
        if (target != null) {
            if (!this.deferred) {
                if (!this.data.hasImage()) {
                    this.picasso.cancelRequest(target);
                    target.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
                    return;
                }
                Request requestCreateRequest = createRequest(jNanoTime);
                String strCreateKey = Utils.createKey(requestCreateRequest);
                if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (bitmapQuickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(strCreateKey)) != null) {
                    this.picasso.cancelRequest(target);
                    target.onBitmapLoaded(bitmapQuickMemoryCacheCheck, Picasso.LoadedFrom.MEMORY);
                    return;
                } else {
                    target.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
                    this.picasso.enqueueAndSubmit(new TargetAction(this.picasso, target, requestCreateRequest, this.memoryPolicy, this.networkPolicy, this.errorDrawable, strCreateKey, this.tag, this.errorResId));
                    return;
                }
            }
            e32.i("Fit cannot be used with a Target.");
            return;
        }
        d.r("Target must not be null.");
    }
}
