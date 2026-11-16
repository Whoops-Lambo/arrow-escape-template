package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.view.AbsSavedState;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ak1;
import defpackage.d;
import defpackage.d10;
import defpackage.e32;
import defpackage.h50;
import defpackage.jc1;
import defpackage.m93;
import defpackage.nj;
import defpackage.vq2;
import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final StretchEdgeEffectFactory sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @VisibleForTesting
    boolean mFirstLayoutComplete;
    GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<ItemDecoration> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @VisibleForTesting
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List<OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList<OnItemTouchListener> mOnItemTouchListeners;

    @VisibleForTesting
    final List<ViewHolder> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Recycler mRecycler;
    RecyclerListener mRecyclerListener;
    final List<RecyclerListener> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final ViewFlinger mViewFlinger;
    private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final ViewInfoStore mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass3 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass5 implements ChildHelper.Callback {
        public final void b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i);
        }

        public AnonymousClass5() {
        }

        public final void a(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass6 implements AdapterHelper.Callback {
        public final ViewHolder b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            ViewHolder viewHolderFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i, true);
            if (viewHolderFindViewHolderForPosition == null) {
                return null;
            }
            ChildHelper childHelper = recyclerView.mChildHelper;
            if (childHelper.c.contains(viewHolderFindViewHolderForPosition.itemView)) {
                return null;
            }
            return viewHolderFindViewHolderForPosition;
        }

        public final void a(AdapterHelper.UpdateOp updateOp) {
            int i = updateOp.a;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 1) {
                recyclerView.mLayout.onItemsAdded(recyclerView, updateOp.b, updateOp.d);
                return;
            }
            if (i == 2) {
                recyclerView.mLayout.onItemsRemoved(recyclerView, updateOp.b, updateOp.d);
            } else if (i == 4) {
                recyclerView.mLayout.onItemsUpdated(recyclerView, updateOp.b, updateOp.d, updateOp.c);
            } else {
                if (i != 8) {
                    return;
                }
                recyclerView.mLayout.onItemsMoved(recyclerView, updateOp.b, updateOp.d, 1);
            }
        }

        public final void c(int i, int i2, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.viewRangeUpdate(i, i2, obj);
            recyclerView.mItemsChanged = true;
        }

        public final void d(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForInsert(i, i2);
            recyclerView.mItemsAddedOrRemoved = true;
        }

        public final void e(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForMove(i, i2);
            recyclerView.mItemsAddedOrRemoved = true;
        }

        public final void f(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i, i2, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.c += i2;
        }

        public AnonymousClass6() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Adapter<VH extends ViewHolder> {
        private final AdapterDataObservable mObservable = new AdapterDataObservable();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class StateRestorationPolicy {
            public static final StateRestorationPolicy a;
            public static final /* synthetic */ StateRestorationPolicy[] b;

            static {
                StateRestorationPolicy stateRestorationPolicy = new StateRestorationPolicy("ALLOW", 0);
                a = stateRestorationPolicy;
                b = new StateRestorationPolicy[]{stateRestorationPolicy, new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1), new StateRestorationPolicy("PREVENT", 2)};
            }

            public static StateRestorationPolicy valueOf(String str) {
                return (StateRestorationPolicy) Enum.valueOf(StateRestorationPolicy.class, str);
            }

            public static StateRestorationPolicy[] values() {
                return (StateRestorationPolicy[]) b.clone();
            }
        }

        public abstract int getItemCount();

        public int getItemViewType(int i) {
            return 0;
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(ViewHolder viewHolder, int i);

        public abstract ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh) {
        }

        public void onViewRecycled(@NonNull VH vh) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                int i2 = TraceCompat.a;
                Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).c = true;
                }
                int i3 = TraceCompat.a;
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return false;
                }
            } else if (getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i) {
            try {
                int i2 = TraceCompat.a;
                Trace.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i;
                Trace.endSection();
                return vh;
            } catch (Throwable th) {
                int i3 = TraceCompat.a;
                Trace.endSection();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends ViewHolder> adapter, @NonNull ViewHolder viewHolder, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public long getItemId(int i) {
            return -1L;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.d(i, 1, null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.e(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.d(i, i2, null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.e(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.f(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.f(i, 1);
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public void onBindViewHolder(@NonNull VH vh, int i, @NonNull List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
            } else {
                e32.i("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
        }

        public final void notifyItemRangeChanged(int i, int i2, @Nullable Object obj) {
            this.mObservable.d(i, i2, obj);
        }

        public final void notifyItemChanged(int i, @Nullable Object obj) {
            this.mObservable.d(i, 1, obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AdapterDataObservable extends Observable<AdapterDataObserver> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public final void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        public final void d(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        public final void e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public final void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ChildDrawingOrderCallback {
        int a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class EdgeEffectFactory {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class ItemAnimator {
        public ItemAnimatorListener a;
        public ArrayList b;
        public long c;
        public long d;
        public long e;
        public long f;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface ItemAnimatorFinishedListener {
            void a();
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface ItemAnimatorListener {
            void a(ViewHolder viewHolder);
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class ItemHolderInfo {
            public int a;
            public int b;

            public final void a(ViewHolder viewHolder) {
                View view = viewHolder.itemView;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public abstract boolean a(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean b(ViewHolder viewHolder, ViewHolder viewHolder2, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean c(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean d(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public boolean f(ViewHolder viewHolder) {
            return true;
        }

        public abstract void i(ViewHolder viewHolder);

        public abstract void j();

        public abstract boolean k();

        public abstract void l();

        public static void e(ViewHolder viewHolder) {
            int i = viewHolder.mFlags;
            if (!viewHolder.isInvalid() && (i & 4) == 0) {
                viewHolder.getOldPosition();
                viewHolder.getAbsoluteAdapterPosition();
            }
        }

        public final void h(ViewHolder viewHolder) {
            ItemAnimatorListener itemAnimatorListener = this.a;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.a(viewHolder);
            }
        }

        public boolean g(ViewHolder viewHolder, List list) {
            return f(viewHolder);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        ViewBoundsCheck mHorizontalBoundCheck;
        private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @Nullable
        SmoothScroller mSmoothScroller;
        ViewBoundsCheck mVerticalBoundCheck;
        private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface LayoutPrefetchRegistry {
            void a(int i, int i2);
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Properties {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 == -1) {
                i4 = iMax;
            } else if (i4 != -2) {
                i2 = 0;
                i4 = 0;
            } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                i4 = iMax;
                i2 = Integer.MIN_VALUE;
            } else {
                i4 = iMax;
                i2 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void collectInitialPrefetchPositions(int i, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public int computeHorizontalScrollExtent(State state) {
            return 0;
        }

        public int computeHorizontalScrollOffset(State state) {
            return 0;
        }

        public int computeHorizontalScrollRange(State state) {
            return 0;
        }

        public int computeVerticalScrollExtent(State state) {
            return 0;
        }

        public int computeVerticalScrollOffset(State state) {
            return 0;
        }

        public int computeVerticalScrollRange(State state) {
            return 0;
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, recycler);
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public int getBaseline() {
            return -1;
        }

        public int getColumnCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getRowCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return 0;
        }

        public boolean isLayoutHierarchical(@NonNull Recycler recycler, @NonNull State state) {
            return false;
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i, Recycler recycler, State state) {
            return null;
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i) {
            return null;
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onLayoutCompleted(State state) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, Recycler recycler, State state) {
            return 0;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public static Properties getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
            Properties properties = new Properties();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i, i2);
            properties.a = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_orientation, 1);
            properties.b = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_spanCount, 1);
            properties.c = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_reverseLayout, false);
            properties.d = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return properties;
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void detachAndScrapView(@NonNull View view, @NonNull Recycler recycler) {
            m(recycler, this.mChildHelper.e(view), view);
        }

        public void detachView(@NonNull View view) {
            ViewHolder childViewHolderInt;
            int iE = this.mChildHelper.e(view);
            if (iE >= 0) {
                ChildHelper childHelper = this.mChildHelper;
                int iD = childHelper.d(iE);
                childHelper.b.f(iD);
                RecyclerView recyclerView = RecyclerView.this;
                View childAt = recyclerView.getChildAt(iD);
                if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                        sb.append(childViewHolderInt);
                        d.r(nj.n(recyclerView, sb));
                        return;
                    }
                    childViewHolderInt.addFlags(256);
                }
                recyclerView.detachViewFromParent(iD);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.i(RecyclerView.getChildViewHolderInt(view));
            }
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.c.contains(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        @Nullable
        public View getChildAt(int i) {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.b(i);
            }
            return null;
        }

        public int getChildCount() {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.c();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        @Nullable
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @Px
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = ViewCompat.a;
            return recyclerView.getLayoutDirection();
        }

        @Px
        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = ViewCompat.a;
            return recyclerView.getMinimumHeight();
        }

        @Px
        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = ViewCompat.a;
            return recyclerView.getMinimumWidth();
        }

        @Px
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @Px
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = ViewCompat.a;
            return recyclerView.getPaddingEnd();
        }

        @Px
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @Px
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @Px
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = ViewCompat.a;
            return recyclerView.getPaddingStart();
        }

        @Px
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z, @NonNull Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @Px
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            SmoothScroller smoothScroller = this.mSmoothScroller;
            return smoothScroller != null && smoothScroller.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
            return z ? z3 : !z3;
        }

        public void offsetChildrenHorizontal(@Px int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(@Px int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void onInitializeAccessibilityEvent(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            Adapter adapter = this.mRecyclerView.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.a(8192);
                accessibilityNodeInfoCompat.q(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.a(4096);
                accessibilityNodeInfoCompat.q(true);
            }
            accessibilityNodeInfoCompat.l(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), getSelectionModeForAccessibility(recycler, state), isLayoutHierarchical(recycler, state)));
        }

        public void onLayoutChildren(Recycler recycler, State state) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onMeasure(@NonNull Recycler recycler, @NonNull State state, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        public void onSmoothScrollerStopped(SmoothScroller smoothScroller) {
            if (this.mSmoothScroller == smoothScroller) {
                this.mSmoothScroller = null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r9
  0x0067: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:29:0x0084, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(@NonNull Recycler recycler, @NonNull State state, int i, @Nullable Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i2;
            int i3;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i2 = paddingTop;
                    i3 = paddingLeft;
                } else {
                    i2 = paddingTop;
                    i3 = 0;
                }
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i2 = paddingTop;
                    i3 = paddingLeft;
                } else {
                    i2 = paddingTop;
                    i3 = 0;
                }
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap weakHashMap = ViewCompat.a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        public void removeAndRecycleScrapInt(Recycler recycler) {
            ArrayList arrayList;
            int size = recycler.a.size();
            int i = size - 1;
            while (true) {
                arrayList = recycler.a;
                if (i < 0) {
                    break;
                }
                View view = ((ViewHolder) arrayList.get(i)).itemView;
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
                    if (itemAnimator != null) {
                        itemAnimator.i(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    recycler.j(childViewHolderInt2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList arrayList2 = recycler.b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            ChildHelper childHelper = this.mChildHelper;
            AnonymousClass5 anonymousClass5 = childHelper.a;
            int iIndexOfChild = RecyclerView.this.indexOfChild(view);
            if (iIndexOfChild < 0) {
                return;
            }
            if (childHelper.b.f(iIndexOfChild)) {
                childHelper.f(view);
            }
            anonymousClass5.b(iIndexOfChild);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.n();
                }
            }
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && l(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && l(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.mSmoothScroller;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = smoothScroller;
            smoothScroller.start(this.mRecyclerView, this);
        }

        public void stopSmoothScroller() {
            SmoothScroller smoothScroller = this.mSmoothScroller;
            if (smoothScroller != null) {
                smoothScroller.stop();
            }
        }

        public LayoutManager() {
            ViewBoundsCheck.Callback callback = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.1
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int a() {
                    return LayoutManager.this.getPaddingLeft();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int b() {
                    LayoutManager layoutManager = LayoutManager.this;
                    return layoutManager.getWidth() - layoutManager.getPaddingRight();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final View c(int i) {
                    return LayoutManager.this.getChildAt(i);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int d(View view) {
                    return LayoutManager.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int e(View view) {
                    return LayoutManager.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
                }
            };
            this.mHorizontalBoundCheckCallback = callback;
            ViewBoundsCheck.Callback callback2 = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.2
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int a() {
                    return LayoutManager.this.getPaddingTop();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int b() {
                    LayoutManager layoutManager = LayoutManager.this;
                    return layoutManager.getHeight() - layoutManager.getPaddingBottom();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final View c(int i) {
                    return LayoutManager.this.getChildAt(i);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int d(View view) {
                    return LayoutManager.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public final int e(View view) {
                    return LayoutManager.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
                }
            };
            this.mVerticalBoundCheckCallback = callback2;
            this.mHorizontalBoundCheck = new ViewBoundsCheck(callback);
            this.mVerticalBoundCheck = new ViewBoundsCheck(callback2);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i2, i3);
                }
                return size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public static boolean l(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i) {
                    return false;
                }
                return true;
            }
            if (size < i) {
                return false;
            }
            return true;
        }

        public void attachView(@NonNull View view, int i, LayoutParams layoutParams) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zIsRemoved = childViewHolderInt.isRemoved();
            RecyclerView recyclerView = this.mRecyclerView;
            if (zIsRemoved) {
                SimpleArrayMap simpleArrayMap = recyclerView.mViewInfoStore.a;
                ViewInfoStore.InfoRecord infoRecordA = (ViewInfoStore.InfoRecord) simpleArrayMap.get(childViewHolderInt);
                if (infoRecordA == null) {
                    infoRecordA = ViewInfoStore.InfoRecord.a();
                    simpleArrayMap.put(childViewHolderInt, infoRecordA);
                }
                infoRecordA.a |= 1;
            } else {
                recyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            this.mChildHelper.a(view, i, layoutParams, childViewHolderInt.isRemoved());
        }

        public void detachAndScrapAttachedViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                m(recycler, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapViewAt(int i, @NonNull Recycler recycler) {
            m(recycler, i, getChildAt(i));
        }

        public void detachViewAt(int i) {
            ViewHolder childViewHolderInt;
            getChildAt(i);
            ChildHelper childHelper = this.mChildHelper;
            int iD = childHelper.d(i);
            childHelper.b.f(iD);
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(iD);
            if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    d.r(nj.n(recyclerView, sb));
                    return;
                }
                childViewHolderInt.addFlags(256);
            }
            recyclerView.detachViewFromParent(iD);
        }

        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.g || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).b.bottom;
        }

        public int getDecoratedBottom(@NonNull View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).b.left;
        }

        public int getPosition(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).a.getLayoutPosition();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).b.right;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).b.top;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt.addFlags(128);
                this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
            } else {
                d.r(nj.n(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
            }
        }

        public final void k(View view, int i, boolean z) {
            int iD;
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z && !childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            } else {
                SimpleArrayMap simpleArrayMap = this.mRecyclerView.mViewInfoStore.a;
                ViewInfoStore.InfoRecord infoRecordA = (ViewInfoStore.InfoRecord) simpleArrayMap.get(childViewHolderInt);
                if (infoRecordA == null) {
                    infoRecordA = ViewInfoStore.InfoRecord.a();
                    simpleArrayMap.put(childViewHolderInt, infoRecordA);
                }
                infoRecordA.a |= 1;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                ViewParent parent = view.getParent();
                RecyclerView recyclerView = this.mRecyclerView;
                ChildHelper childHelper = this.mChildHelper;
                if (parent == recyclerView) {
                    int iE = childHelper.e(view);
                    if (i == -1) {
                        i = this.mChildHelper.c();
                    }
                    if (iE != -1) {
                        if (iE != i) {
                            this.mRecyclerView.mLayout.moveView(iE, i);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sb.append(this.mRecyclerView.indexOfChild(view));
                        e32.i(nj.n(this.mRecyclerView, sb));
                        return;
                    }
                } else {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    if (i < 0) {
                        iD = recyclerView2.getChildCount();
                    } else {
                        iD = childHelper.d(i);
                    }
                    childHelper.b.e(iD, false);
                    recyclerView2.addView(view, iD);
                    recyclerView2.dispatchChildAttached(view);
                    layoutParams.c = true;
                    SmoothScroller smoothScroller = this.mSmoothScroller;
                    if (smoothScroller != null && smoothScroller.isRunning()) {
                        this.mSmoothScroller.onChildAttachedToWindow(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.a(view, i, view.getLayoutParams(), false);
            }
            if (layoutParams.d) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.d = false;
            }
        }

        public void layoutDecorated(@NonNull View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public final void m(Recycler recycler, int i, View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                recycler.j(childViewHolderInt);
            } else {
                detachViewAt(i);
                recycler.k(view);
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
        }

        public void measureChild(@NonNull View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
            }
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                ChildHelper childHelper = this.mChildHelper;
                if (!childHelper.c.contains(childViewHolderInt.itemView)) {
                    RecyclerView recyclerView = this.mRecyclerView;
                    onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, accessibilityNodeInfoCompat);
                }
            }
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            if (!isSmoothScrolling() && !recyclerView.isComputingLayout()) {
                return false;
            }
            return true;
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ChildHelper childHelper = this.mChildHelper;
                int iD = childHelper.d(childCount);
                AnonymousClass5 anonymousClass5 = childHelper.a;
                View childAt = RecyclerView.this.getChildAt(iD);
                if (childAt != null) {
                    if (childHelper.b.f(iD)) {
                        childHelper.f(childAt);
                    }
                    anonymousClass5.b(iD);
                }
            }
        }

        public void removeAndRecycleAllViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, recycler);
                }
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull Recycler recycler) {
            removeView(view);
            recycler.i(view);
        }

        public void removeAndRecycleViewAt(int i, @NonNull Recycler recycler) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            recycler.i(childAt);
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                ChildHelper childHelper = this.mChildHelper;
                int iD = childHelper.d(i);
                AnonymousClass5 anonymousClass5 = childHelper.a;
                View childAt = RecyclerView.this.getChildAt(iD);
                if (childAt != null) {
                    if (childHelper.b.f(iD)) {
                        childHelper.f(childAt);
                    }
                    anonymousClass5.b(iD);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:33:0x00be  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - paddingLeft;
            int iMin = Math.min(0, i);
            int i2 = top - paddingTop;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - width;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() == 1) {
                if (iMax == 0) {
                    iMax = Math.max(iMin, i3);
                }
            } else {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            int[] iArr = {iMax, iMin2};
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int paddingLeft2 = getPaddingLeft();
                    int paddingTop2 = getPaddingTop();
                    int width2 = getWidth() - getPaddingRight();
                    int height2 = getHeight() - getPaddingBottom();
                    Rect rect2 = this.mRecyclerView.mTempRect;
                    getDecoratedBoundsWithMargins(focusedChild, rect2);
                    if (rect2.left - i4 < width2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < height2 && rect2.bottom - i5 > paddingTop2) {
                        if (i4 == 0) {
                        }
                        if (z) {
                            recyclerView.scrollBy(i4, i5);
                        } else {
                            recyclerView.smoothScrollBy(i4, i5);
                        }
                        return true;
                    }
                }
            } else if (i4 == 0 || i5 != 0) {
                if (z) {
                    recyclerView.scrollBy(i4, i5);
                } else {
                    recyclerView.smoothScrollBy(i4, i5);
                }
                return true;
            }
            return false;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mHeight = 0;
            }
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public boolean shouldMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            if (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && l(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && l(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        public void stopIgnoringView(@NonNull View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i) {
            k(view, i, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i) {
            k(view, i, false);
        }

        public boolean performAccessibilityActionForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, int i, @Nullable Bundle bundle) {
            return false;
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull State state, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000c A[PHI: r3
  0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:6:0x000e  */
        @Deprecated
        public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
            int i4 = i - i2;
            int i5 = 0;
            int iMax = Math.max(0, i4);
            if (z) {
                if (i3 >= 0) {
                    i5 = 1073741824;
                } else {
                    i3 = 0;
                }
            } else if (i3 >= 0) {
                i5 = 1073741824;
            } else if (i3 == -1) {
                i3 = iMax;
                i5 = 1073741824;
            } else if (i3 == -2) {
                i5 = Integer.MIN_VALUE;
                i3 = iMax;
            } else {
                i3 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i5);
        }

        public void attachView(@NonNull View view, int i) {
            attachView(view, i, (LayoutParams) view.getLayoutParams());
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, accessibilityNodeInfoCompat);
        }

        public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnChildAttachStateChangeListener {
        void a(View view);

        void b(View view);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class OnFlingListener {
        public abstract boolean onFling(int i, int i2);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnItemTouchListener {
        void c(boolean z);

        boolean d(MotionEvent motionEvent);

        void onTouchEvent(MotionEvent motionEvent);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class OnScrollListener {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Orientation {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class RecycledViewPool {
        public SparseArray a;
        public int b;
        public Set c;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class ScrapData {
            public final ArrayList a = new ArrayList();
            public final int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public final ScrapData a(int i) {
            SparseArray sparseArray = this.a;
            ScrapData scrapData = (ScrapData) sparseArray.get(i);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            sparseArray.put(i, scrapData2);
            return scrapData2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class Recycler {
        public final ArrayList a;
        public ArrayList b;
        public final ArrayList c;
        public final List d;
        public int e;
        public int f;
        public RecycledViewPool g;
        public ViewCacheExtension h;

        public final int b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.mState.b()) {
                return !recyclerView.mState.g ? i : recyclerView.mAdapterHelper.f(i, 0);
            }
            StringBuilder sbS = jc1.s(i, "invalid position ", ". State item count is ");
            sbS.append(recyclerView.mState.b());
            sbS.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbS.toString());
        }

        public final RecycledViewPool c() {
            if (this.g == null) {
                RecycledViewPool recycledViewPool = new RecycledViewPool();
                recycledViewPool.a = new SparseArray();
                recycledViewPool.b = 0;
                recycledViewPool.c = Collections.newSetFromMap(new IdentityHashMap());
                this.g = recycledViewPool;
                e();
            }
            return this.g;
        }

        public final void e() {
            if (this.g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                RecycledViewPool recycledViewPool = this.g;
                recycledViewPool.c.add(recyclerView.mAdapter);
            }
        }

        public final void f(Adapter adapter, boolean z) {
            RecycledViewPool recycledViewPool = this.g;
            if (recycledViewPool != null) {
                SparseArray sparseArray = recycledViewPool.a;
                Set set = recycledViewPool.c;
                set.remove(adapter);
                if (set.size() != 0 || z) {
                    return;
                }
                for (int i = 0; i < sparseArray.size(); i++) {
                    ArrayList arrayList = ((RecycledViewPool.ScrapData) sparseArray.get(sparseArray.keyAt(i))).a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        PoolingContainer.b(((ViewHolder) arrayList.get(i2)).itemView);
                    }
                }
            }
        }

        public final void g() {
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = layoutPrefetchRegistryImpl.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                layoutPrefetchRegistryImpl.d = 0;
            }
        }

        public final void h(int i) {
            ArrayList arrayList = this.c;
            a((ViewHolder) arrayList.get(i), true);
            arrayList.remove(i);
        }

        /* JADX WARN: Code duplicated, block: B:106:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:108:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:109:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:111:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:124:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:126:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:127:0x0207  */
        /* JADX WARN: Code duplicated, block: B:129:0x020d  */
        /* JADX WARN: Code duplicated, block: B:131:0x0215  */
        /* JADX WARN: Code duplicated, block: B:136:0x0230  */
        /* JADX WARN: Code duplicated, block: B:199:0x0361 A[EDGE_INSN: B:199:0x0361->B:200:0x0362 BREAK  A[LOOP:5: B:194:0x0349->B:198:0x035e]] */
        /* JADX WARN: Code duplicated, block: B:231:0x03f4  */
        /* JADX WARN: Code duplicated, block: B:239:0x0415  */
        /* JADX WARN: Code duplicated, block: B:245:0x043a  */
        /* JADX WARN: Code duplicated, block: B:247:0x0440  */
        /* JADX WARN: Code duplicated, block: B:253:0x0452  */
        /* JADX WARN: Code duplicated, block: B:255:0x0468  */
        /* JADX WARN: Code duplicated, block: B:257:0x0474  */
        /* JADX WARN: Code duplicated, block: B:262:0x0494  */
        /* JADX WARN: Code duplicated, block: B:265:0x04a3  */
        /* JADX WARN: Code duplicated, block: B:267:0x04ad  */
        /* JADX WARN: Code duplicated, block: B:268:0x04b3  */
        /* JADX WARN: Code duplicated, block: B:272:0x04ba  */
        /* JADX WARN: Code duplicated, block: B:274:0x04c2  */
        /* JADX WARN: Code duplicated, block: B:276:0x04cb A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:279:0x04d6  */
        /* JADX WARN: Code duplicated, block: B:282:0x04de  */
        /* JADX WARN: Code duplicated, block: B:286:0x04e9  */
        /* JADX WARN: Code duplicated, block: B:287:0x04f5  */
        /* JADX WARN: Code duplicated, block: B:289:0x04fb  */
        /* JADX WARN: Code duplicated, block: B:290:0x0507  */
        /* JADX WARN: Code duplicated, block: B:293:0x050d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:295:0x0511  */
        /* JADX WARN: Code duplicated, block: B:306:0x00c4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:312:0x00ef A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:317:0x01a9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0083 A[EDGE_INSN: B:35:0x0083->B:36:0x0084 BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
        /* JADX WARN: Code duplicated, block: B:42:0x0090  */
        /* JADX WARN: Code duplicated, block: B:44:0x0097  */
        /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:71:0x0104  */
        /* JADX WARN: Code duplicated, block: B:73:0x010a  */
        /* JADX WARN: Code duplicated, block: B:75:0x0119  */
        /* JADX WARN: Code duplicated, block: B:88:0x0164  */
        /* JADX WARN: Code duplicated, block: B:90:0x0176  */
        /* JADX WARN: Code duplicated, block: B:92:0x017c  */
        /* JADX WARN: Code duplicated, block: B:94:0x0182  */
        /* JADX WARN: Code duplicated, block: B:96:0x0189  */
        /* JADX WARN: Multi-variable type inference failed */
        public final ViewHolder l(int i, long j) {
            ViewHolder childViewHolder;
            int i2;
            ArrayList arrayList;
            ArrayList arrayList2;
            int i3;
            long j2;
            long j3;
            long j4;
            int itemViewType;
            long nanoTime;
            long j5;
            int i4;
            int i5;
            View view;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate;
            AccessibilityDelegateCompat accessibilityDelegateCompatJ;
            RecyclerViewAccessibilityDelegate.ItemDelegate itemDelegate;
            AccessibilityDelegateCompat accessibilityDelegateCompatE;
            long j6;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            boolean z;
            int iF;
            RecyclerView recyclerViewFindNestedRecyclerView;
            ViewHolder viewHolder;
            ViewCacheExtension viewCacheExtension;
            View viewA;
            int size;
            int i6;
            ArrayList arrayList3;
            int size2;
            int i7;
            View view2;
            int size3;
            int i8;
            ViewHolder viewHolder2;
            ChildHelper childHelper;
            ChildHelper.Bucket bucket;
            int iIndexOfChild;
            int iE;
            View childAt;
            ViewHolder childViewHolderInt;
            ViewHolder childViewHolderInt2;
            int i9;
            boolean z2;
            int size4;
            int iF2;
            RecyclerView recyclerView = RecyclerView.this;
            if (i < 0 || i >= recyclerView.mState.b()) {
                StringBuilder sbT = jc1.t("Invalid item position ", i, "(", i, "). Item count:");
                sbT.append(recyclerView.mState.b());
                sbT.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbT.toString());
            }
            int i10 = 1;
            if (recyclerView.mState.g) {
                ArrayList arrayList4 = this.b;
                if (arrayList4 != null && (size4 = arrayList4.size()) != 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size4) {
                            if (recyclerView.mAdapter.hasStableIds() && (iF2 = recyclerView.mAdapterHelper.f(i, 0)) > 0 && iF2 < recyclerView.mAdapter.getItemCount()) {
                                long itemId = recyclerView.mAdapter.getItemId(iF2);
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= size4) {
                                        childViewHolder = null;
                                        break;
                                    }
                                    ViewHolder viewHolder3 = (ViewHolder) this.b.get(i12);
                                    if (!viewHolder3.wasReturnedFromScrap() && viewHolder3.getItemId() == itemId) {
                                        viewHolder3.addFlags(32);
                                        childViewHolder = viewHolder3;
                                        break;
                                    }
                                    i12++;
                                }
                            } else {
                                childViewHolder = null;
                                break;
                            }
                        } else {
                            childViewHolder = (ViewHolder) this.b.get(i11);
                            if (!childViewHolder.wasReturnedFromScrap() && childViewHolder.getLayoutPosition() == i) {
                                childViewHolder.addFlags(32);
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    childViewHolder = null;
                    break;
                }
                if (childViewHolder != null) {
                    i2 = 1;
                }
                arrayList = this.a;
                arrayList2 = this.c;
                if (childViewHolder == null) {
                    size = arrayList.size();
                    i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            arrayList3 = recyclerView.mChildHelper.c;
                            size2 = arrayList3.size();
                            i7 = 0;
                            while (true) {
                                if (i7 < size2) {
                                    view2 = null;
                                    break;
                                }
                                view2 = (View) arrayList3.get(i7);
                                childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                                if (childViewHolderInt2.getLayoutPosition() != i && !childViewHolderInt2.isInvalid() && !childViewHolderInt2.isRemoved()) {
                                    break;
                                }
                                i7++;
                            }
                            if (view2 != null) {
                                size3 = arrayList2.size();
                                i8 = 0;
                                while (true) {
                                    if (i8 < size3) {
                                        childViewHolder = null;
                                        break;
                                    }
                                    viewHolder2 = (ViewHolder) arrayList2.get(i8);
                                    if (viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i && !viewHolder2.isAttachedToTransitionOverlay()) {
                                        arrayList2.remove(i8);
                                    } else {
                                        i8++;
                                    }
                                }
                            } else {
                                childViewHolder = RecyclerView.getChildViewHolderInt(view2);
                                childHelper = recyclerView.mChildHelper;
                                bucket = childHelper.b;
                                iIndexOfChild = RecyclerView.this.indexOfChild(view2);
                                if (iIndexOfChild >= 0) {
                                    vq2.r(view2, "view is not a child, cannot hide ");
                                    return null;
                                }
                                if (bucket.d(iIndexOfChild)) {
                                    m93.i(view2, "trying to unhide a view that was not hidden");
                                    return null;
                                }
                                bucket.a(iIndexOfChild);
                                childHelper.f(view2);
                                iE = recyclerView.mChildHelper.e(view2);
                                if (iE != -1) {
                                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                    sb.append(childViewHolder);
                                    e32.i(nj.n(recyclerView, sb));
                                    return null;
                                }
                                ChildHelper childHelper2 = recyclerView.mChildHelper;
                                int iD = childHelper2.d(iE);
                                childHelper2.b.f(iD);
                                RecyclerView recyclerView2 = RecyclerView.this;
                                childAt = recyclerView2.getChildAt(iD);
                                if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
                                    if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                                        StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                                        sb2.append(childViewHolderInt);
                                        d.r(nj.n(recyclerView2, sb2));
                                        return null;
                                    }
                                    childViewHolderInt.addFlags(256);
                                }
                                recyclerView2.detachViewFromParent(iD);
                                k(view2);
                                childViewHolder.addFlags(8224);
                                break;
                            }
                        } else {
                            viewHolder2 = (ViewHolder) arrayList.get(i6);
                            if (!viewHolder2.wasReturnedFromScrap() || viewHolder2.getLayoutPosition() != i || viewHolder2.isInvalid() || (!recyclerView.mState.g && viewHolder2.isRemoved())) {
                                i6++;
                            } else {
                                viewHolder2.addFlags(32);
                            }
                        }
                        childViewHolder = viewHolder2;
                        break;
                    }
                    if (childViewHolder != null) {
                        if (childViewHolder.isRemoved()) {
                            z2 = recyclerView.mState.g;
                        } else {
                            i9 = childViewHolder.mPosition;
                            if (i9 >= 0 || i9 >= recyclerView.mAdapter.getItemCount()) {
                                StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                sb3.append(childViewHolder);
                                y.p(nj.n(recyclerView, sb3));
                                return null;
                            }
                            z2 = (recyclerView.mState.g || recyclerView.mAdapter.getItemViewType(childViewHolder.mPosition) == childViewHolder.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || childViewHolder.getItemId() == recyclerView.mAdapter.getItemId(childViewHolder.mPosition));
                        }
                        if (z2) {
                            i2 = 1;
                        } else {
                            childViewHolder.addFlags(4);
                            if (childViewHolder.isScrap()) {
                                recyclerView.removeDetachedView(childViewHolder.itemView, false);
                                childViewHolder.unScrap();
                            } else if (childViewHolder.wasReturnedFromScrap()) {
                                childViewHolder.clearReturnedFromScrapFlag();
                            }
                            j(childViewHolder);
                            childViewHolder = null;
                        }
                    }
                }
                if (childViewHolder == null) {
                    j2 = 3;
                    iF = recyclerView.mAdapterHelper.f(i, 0);
                    if (iF >= 0 || iF >= recyclerView.mAdapter.getItemCount()) {
                        StringBuilder sbT2 = jc1.t("Inconsistency detected. Invalid item position ", i, "(offset:", iF, ").state:");
                        sbT2.append(recyclerView.mState.b());
                        sbT2.append(recyclerView.exceptionLabel());
                        throw new IndexOutOfBoundsException(sbT2.toString());
                    }
                    int itemViewType2 = recyclerView.mAdapter.getItemViewType(iF);
                    j3 = 4;
                    if (recyclerView.mAdapter.hasStableIds()) {
                        long itemId2 = recyclerView.mAdapter.getItemId(iF);
                        int size5 = arrayList.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                i3 = i10;
                                j4 = 0;
                                int size6 = arrayList2.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        ViewHolder viewHolder4 = (ViewHolder) arrayList2.get(size6);
                                        if (viewHolder4.getItemId() != itemId2 || viewHolder4.isAttachedToTransitionOverlay()) {
                                            size6--;
                                        } else {
                                            if (itemViewType2 == viewHolder4.getItemViewType()) {
                                                arrayList2.remove(size6);
                                                childViewHolder = viewHolder4;
                                                break;
                                            }
                                            h(size6);
                                        }
                                    }
                                    childViewHolder = null;
                                    break;
                                }
                            }
                            j4 = 0;
                            ViewHolder viewHolder5 = (ViewHolder) arrayList.get(size5);
                            if (viewHolder5.getItemId() != itemId2 || viewHolder5.wasReturnedFromScrap()) {
                                i3 = i10;
                            } else {
                                i3 = i10;
                                if (itemViewType2 == viewHolder5.getItemViewType()) {
                                    viewHolder5.addFlags(32);
                                    if (viewHolder5.isRemoved() && !recyclerView.mState.g) {
                                        viewHolder5.setFlags(2, 14);
                                    }
                                    childViewHolder = viewHolder5;
                                    break;
                                }
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(viewHolder5.itemView, false);
                                ViewHolder childViewHolderInt3 = RecyclerView.getChildViewHolderInt(viewHolder5.itemView);
                                childViewHolderInt3.mScrapContainer = null;
                                childViewHolderInt3.mInChangeScrap = false;
                                childViewHolderInt3.clearReturnedFromScrapFlag();
                                j(childViewHolderInt3);
                            }
                            size5--;
                            i10 = i3;
                        }
                        if (childViewHolder != null) {
                            childViewHolder.mPosition = iF;
                            i2 = i3;
                        }
                    } else {
                        i3 = 1;
                        j4 = 0;
                    }
                    if (childViewHolder == null && (viewCacheExtension = this.h) != null && (viewA = viewCacheExtension.a()) != null) {
                        childViewHolder = recyclerView.getChildViewHolder(viewA);
                        if (childViewHolder == null) {
                            d.r(nj.n(recyclerView, new StringBuilder("getViewForPositionAndType returned a view which does not have a ViewHolder")));
                            return null;
                        }
                        if (childViewHolder.shouldIgnore()) {
                            d.r(nj.n(recyclerView, new StringBuilder("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.")));
                            return null;
                        }
                    }
                    if (childViewHolder == null) {
                        RecycledViewPool.ScrapData scrapData = (RecycledViewPool.ScrapData) c().a.get(itemViewType2);
                        if (scrapData == null) {
                            viewHolder = null;
                            break;
                        }
                        ArrayList arrayList5 = scrapData.a;
                        if (!arrayList5.isEmpty()) {
                            int size7 = arrayList5.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    viewHolder = null;
                                    break;
                                }
                                if (!((ViewHolder) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                                    viewHolder = (ViewHolder) arrayList5.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            viewHolder = null;
                            break;
                        }
                        if (viewHolder != null) {
                            viewHolder.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                View view3 = viewHolder.itemView;
                                if (view3 instanceof ViewGroup) {
                                    d((ViewGroup) view3, false);
                                }
                            }
                        }
                        childViewHolder = viewHolder;
                    }
                    if (childViewHolder == null) {
                        long nanoTime2 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j7 = this.g.a(itemViewType2).c;
                            if (((j7 == j4 || j7 + nanoTime2 < j) ? i3 : 0) == 0) {
                                return null;
                            }
                        }
                        ViewHolder viewHolderCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType2);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(viewHolderCreateViewHolder.itemView)) != null) {
                            viewHolderCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                        RecycledViewPool.ScrapData scrapDataA = this.g.a(itemViewType2);
                        long j8 = scrapDataA.c;
                        if (j8 != j4) {
                            nanoTime3 = (nanoTime3 / 4) + ((j8 / 4) * 3);
                        }
                        scrapDataA.c = nanoTime3;
                        childViewHolder = viewHolderCreateViewHolder;
                    }
                } else {
                    i3 = 1;
                    j2 = 3;
                    j3 = 4;
                    j4 = 0;
                }
                if (i2 != 0 && !recyclerView.mState.g && childViewHolder.hasAnyOfTheFlags(8192)) {
                    childViewHolder.setFlags(0, 8192);
                    if (recyclerView.mState.j) {
                        ItemAnimator.e(childViewHolder);
                        ItemAnimator itemAnimator = recyclerView.mItemAnimator;
                        childViewHolder.getUnmodifiedPayloads();
                        itemAnimator.getClass();
                        ItemAnimator.ItemHolderInfo itemHolderInfo = new ItemAnimator.ItemHolderInfo();
                        itemHolderInfo.a(childViewHolder);
                        recyclerView.recordAnimationInfoIfBouncedHiddenView(childViewHolder, itemHolderInfo);
                    }
                }
                if (recyclerView.mState.g || !childViewHolder.isBound()) {
                    if (childViewHolder.isBound() || childViewHolder.needsUpdate() || childViewHolder.isInvalid()) {
                        int iF3 = recyclerView.mAdapterHelper.f(i, 0);
                        childViewHolder.mBindingAdapter = null;
                        childViewHolder.mOwnerRecyclerView = recyclerView;
                        itemViewType = childViewHolder.getItemViewType();
                        long nanoTime4 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j6 = this.g.a(itemViewType).d;
                            if (j6 != j4 || j6 + nanoTime4 < j) {
                            }
                        }
                        recyclerView.mAdapter.bindViewHolder(childViewHolder, iF3);
                        nanoTime = recyclerView.getNanoTime() - nanoTime4;
                        RecycledViewPool.ScrapData scrapDataA2 = this.g.a(childViewHolder.getItemViewType());
                        j5 = scrapDataA2.d;
                        if (j5 != j4) {
                            nanoTime = (nanoTime / j3) + ((j5 / j3) * j2);
                        }
                        scrapDataA2.d = nanoTime;
                        if (recyclerView.isAccessibilityEnabled()) {
                            view = childViewHolder.itemView;
                            WeakHashMap weakHashMap = ViewCompat.a;
                            if (view.getImportantForAccessibility() == 0) {
                                i4 = i3;
                                view.setImportantForAccessibility(i4);
                            } else {
                                i4 = i3;
                            }
                            recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                            if (recyclerViewAccessibilityDelegate != null) {
                                accessibilityDelegateCompatJ = recyclerViewAccessibilityDelegate.j();
                                if (accessibilityDelegateCompatJ instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                                    itemDelegate = (RecyclerViewAccessibilityDelegate.ItemDelegate) accessibilityDelegateCompatJ;
                                    accessibilityDelegateCompatE = ViewCompat.e(view);
                                    if (accessibilityDelegateCompatE != null && accessibilityDelegateCompatE != itemDelegate) {
                                        itemDelegate.e.put(view, accessibilityDelegateCompatE);
                                    }
                                }
                                ViewCompat.z(view, accessibilityDelegateCompatJ);
                            }
                        } else {
                            i4 = i3;
                        }
                        if (recyclerView.mState.g) {
                            childViewHolder.mPreLayoutPosition = i;
                        }
                        i5 = i4;
                    }
                    layoutParams = childViewHolder.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                        childViewHolder.itemView.setLayoutParams(layoutParams2);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        layoutParams2 = (LayoutParams) layoutParams;
                    } else {
                        layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                        childViewHolder.itemView.setLayoutParams(layoutParams2);
                    }
                    layoutParams2.a = childViewHolder;
                    if (i2 != 0 || i5 == 0) {
                        z = 0;
                    } else {
                        z = i4;
                    }
                    layoutParams2.d = z;
                    return childViewHolder;
                }
                childViewHolder.mPreLayoutPosition = i;
                i5 = 0;
                i4 = i3;
                layoutParams = childViewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                    childViewHolder.itemView.setLayoutParams(layoutParams2);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                    childViewHolder.itemView.setLayoutParams(layoutParams2);
                } else {
                    layoutParams2 = (LayoutParams) layoutParams;
                }
                layoutParams2.a = childViewHolder;
                if (i2 != 0) {
                    z = 0;
                } else {
                    z = 0;
                }
                layoutParams2.d = z;
                return childViewHolder;
            }
            childViewHolder = null;
            i2 = 0;
            arrayList = this.a;
            arrayList2 = this.c;
            if (childViewHolder == null) {
                size = arrayList.size();
                i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        viewHolder2 = (ViewHolder) arrayList.get(i6);
                        if (viewHolder2.wasReturnedFromScrap()) {
                        }
                        i6++;
                    } else {
                        arrayList3 = recyclerView.mChildHelper.c;
                        size2 = arrayList3.size();
                        i7 = 0;
                        while (true) {
                            if (i7 < size2) {
                                view2 = null;
                                break;
                            }
                            view2 = (View) arrayList3.get(i7);
                            childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                            if (childViewHolderInt2.getLayoutPosition() != i) {
                            }
                            i7++;
                        }
                        if (view2 != null) {
                            size3 = arrayList2.size();
                            i8 = 0;
                            while (true) {
                                if (i8 < size3) {
                                    childViewHolder = null;
                                    break;
                                }
                                viewHolder2 = (ViewHolder) arrayList2.get(i8);
                                if (viewHolder2.isInvalid()) {
                                }
                                i8++;
                            }
                        } else {
                            childViewHolder = RecyclerView.getChildViewHolderInt(view2);
                            childHelper = recyclerView.mChildHelper;
                            bucket = childHelper.b;
                            iIndexOfChild = RecyclerView.this.indexOfChild(view2);
                            if (iIndexOfChild >= 0) {
                                vq2.r(view2, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (bucket.d(iIndexOfChild)) {
                                m93.i(view2, "trying to unhide a view that was not hidden");
                                return null;
                            }
                            bucket.a(iIndexOfChild);
                            childHelper.f(view2);
                            iE = recyclerView.mChildHelper.e(view2);
                            if (iE != -1) {
                                StringBuilder sb4 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb4.append(childViewHolder);
                                e32.i(nj.n(recyclerView, sb4));
                                return null;
                            }
                            ChildHelper childHelper3 = recyclerView.mChildHelper;
                            int iD2 = childHelper3.d(iE);
                            childHelper3.b.f(iD2);
                            RecyclerView recyclerView3 = RecyclerView.this;
                            childAt = recyclerView3.getChildAt(iD2);
                            if (childAt != null) {
                                if (!childViewHolderInt.isTmpDetached()) {
                                }
                                childViewHolderInt.addFlags(256);
                            }
                            recyclerView3.detachViewFromParent(iD2);
                            k(view2);
                            childViewHolder.addFlags(8224);
                            break;
                        }
                        if (childViewHolder != null) {
                            if (childViewHolder.isRemoved()) {
                                i9 = childViewHolder.mPosition;
                                if (i9 >= 0) {
                                }
                                StringBuilder sb5 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                sb5.append(childViewHolder);
                                y.p(nj.n(recyclerView, sb5));
                                return null;
                            }
                            z2 = recyclerView.mState.g;
                            if (z2) {
                                childViewHolder.addFlags(4);
                                if (childViewHolder.isScrap()) {
                                    recyclerView.removeDetachedView(childViewHolder.itemView, false);
                                    childViewHolder.unScrap();
                                } else if (childViewHolder.wasReturnedFromScrap()) {
                                    childViewHolder.clearReturnedFromScrapFlag();
                                }
                                j(childViewHolder);
                                childViewHolder = null;
                            } else {
                                i2 = 1;
                            }
                        }
                    }
                    childViewHolder = viewHolder2;
                    if (childViewHolder != null) {
                        if (childViewHolder.isRemoved()) {
                            i9 = childViewHolder.mPosition;
                            if (i9 >= 0) {
                            }
                            StringBuilder sb6 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb6.append(childViewHolder);
                            y.p(nj.n(recyclerView, sb6));
                            return null;
                        }
                        z2 = recyclerView.mState.g;
                        if (z2) {
                            childViewHolder.addFlags(4);
                            if (childViewHolder.isScrap()) {
                                recyclerView.removeDetachedView(childViewHolder.itemView, false);
                                childViewHolder.unScrap();
                            } else if (childViewHolder.wasReturnedFromScrap()) {
                                childViewHolder.clearReturnedFromScrapFlag();
                            }
                            j(childViewHolder);
                            childViewHolder = null;
                        } else {
                            i2 = 1;
                        }
                    }
                }
            }
            if (childViewHolder == null) {
                j2 = 3;
                iF = recyclerView.mAdapterHelper.f(i, 0);
                if (iF >= 0) {
                }
                StringBuilder sbT3 = jc1.t("Inconsistency detected. Invalid item position ", i, "(offset:", iF, ").state:");
                sbT3.append(recyclerView.mState.b());
                sbT3.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbT3.toString());
            }
            i3 = 1;
            j2 = 3;
            j3 = 4;
            j4 = 0;
            if (i2 != 0) {
                childViewHolder.setFlags(0, 8192);
                if (recyclerView.mState.j) {
                    ItemAnimator.e(childViewHolder);
                    ItemAnimator itemAnimator2 = recyclerView.mItemAnimator;
                    childViewHolder.getUnmodifiedPayloads();
                    itemAnimator2.getClass();
                    ItemAnimator.ItemHolderInfo itemHolderInfo2 = new ItemAnimator.ItemHolderInfo();
                    itemHolderInfo2.a(childViewHolder);
                    recyclerView.recordAnimationInfoIfBouncedHiddenView(childViewHolder, itemHolderInfo2);
                }
            }
            if (recyclerView.mState.g) {
                if (childViewHolder.isBound()) {
                    int iF4 = recyclerView.mAdapterHelper.f(i, 0);
                    childViewHolder.mBindingAdapter = null;
                    childViewHolder.mOwnerRecyclerView = recyclerView;
                    itemViewType = childViewHolder.getItemViewType();
                    long nanoTime5 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j6 = this.g.a(itemViewType).d;
                        if (j6 != j4) {
                        }
                    }
                    recyclerView.mAdapter.bindViewHolder(childViewHolder, iF4);
                    nanoTime = recyclerView.getNanoTime() - nanoTime5;
                    RecycledViewPool.ScrapData scrapDataA3 = this.g.a(childViewHolder.getItemViewType());
                    j5 = scrapDataA3.d;
                    if (j5 != j4) {
                        nanoTime = (nanoTime / j3) + ((j5 / j3) * j2);
                    }
                    scrapDataA3.d = nanoTime;
                    if (recyclerView.isAccessibilityEnabled()) {
                        view = childViewHolder.itemView;
                        WeakHashMap weakHashMap2 = ViewCompat.a;
                        if (view.getImportantForAccessibility() == 0) {
                            i4 = i3;
                            view.setImportantForAccessibility(i4);
                        } else {
                            i4 = i3;
                        }
                        recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                        if (recyclerViewAccessibilityDelegate != null) {
                            accessibilityDelegateCompatJ = recyclerViewAccessibilityDelegate.j();
                            if (accessibilityDelegateCompatJ instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                                itemDelegate = (RecyclerViewAccessibilityDelegate.ItemDelegate) accessibilityDelegateCompatJ;
                                accessibilityDelegateCompatE = ViewCompat.e(view);
                                if (accessibilityDelegateCompatE != null) {
                                    itemDelegate.e.put(view, accessibilityDelegateCompatE);
                                }
                            }
                            ViewCompat.z(view, accessibilityDelegateCompatJ);
                        }
                    } else {
                        i4 = i3;
                    }
                    if (recyclerView.mState.g) {
                        childViewHolder.mPreLayoutPosition = i;
                    }
                    i5 = i4;
                } else {
                    int iF5 = recyclerView.mAdapterHelper.f(i, 0);
                    childViewHolder.mBindingAdapter = null;
                    childViewHolder.mOwnerRecyclerView = recyclerView;
                    itemViewType = childViewHolder.getItemViewType();
                    long nanoTime6 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j6 = this.g.a(itemViewType).d;
                        if (j6 != j4) {
                        }
                    }
                    recyclerView.mAdapter.bindViewHolder(childViewHolder, iF5);
                    nanoTime = recyclerView.getNanoTime() - nanoTime6;
                    RecycledViewPool.ScrapData scrapDataA4 = this.g.a(childViewHolder.getItemViewType());
                    j5 = scrapDataA4.d;
                    if (j5 != j4) {
                        nanoTime = (nanoTime / j3) + ((j5 / j3) * j2);
                    }
                    scrapDataA4.d = nanoTime;
                    if (recyclerView.isAccessibilityEnabled()) {
                        view = childViewHolder.itemView;
                        WeakHashMap weakHashMap3 = ViewCompat.a;
                        if (view.getImportantForAccessibility() == 0) {
                            i4 = i3;
                            view.setImportantForAccessibility(i4);
                        } else {
                            i4 = i3;
                        }
                        recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                        if (recyclerViewAccessibilityDelegate != null) {
                            accessibilityDelegateCompatJ = recyclerViewAccessibilityDelegate.j();
                            if (accessibilityDelegateCompatJ instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                                itemDelegate = (RecyclerViewAccessibilityDelegate.ItemDelegate) accessibilityDelegateCompatJ;
                                accessibilityDelegateCompatE = ViewCompat.e(view);
                                if (accessibilityDelegateCompatE != null) {
                                    itemDelegate.e.put(view, accessibilityDelegateCompatE);
                                }
                            }
                            ViewCompat.z(view, accessibilityDelegateCompatJ);
                        }
                    } else {
                        i4 = i3;
                    }
                    if (recyclerView.mState.g) {
                        childViewHolder.mPreLayoutPosition = i;
                    }
                    i5 = i4;
                }
            } else if (childViewHolder.isBound()) {
                int iF6 = recyclerView.mAdapterHelper.f(i, 0);
                childViewHolder.mBindingAdapter = null;
                childViewHolder.mOwnerRecyclerView = recyclerView;
                itemViewType = childViewHolder.getItemViewType();
                long nanoTime7 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j6 = this.g.a(itemViewType).d;
                    if (j6 != j4) {
                    }
                }
                recyclerView.mAdapter.bindViewHolder(childViewHolder, iF6);
                nanoTime = recyclerView.getNanoTime() - nanoTime7;
                RecycledViewPool.ScrapData scrapDataA5 = this.g.a(childViewHolder.getItemViewType());
                j5 = scrapDataA5.d;
                if (j5 != j4) {
                    nanoTime = (nanoTime / j3) + ((j5 / j3) * j2);
                }
                scrapDataA5.d = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view = childViewHolder.itemView;
                    WeakHashMap weakHashMap4 = ViewCompat.a;
                    if (view.getImportantForAccessibility() == 0) {
                        i4 = i3;
                        view.setImportantForAccessibility(i4);
                    } else {
                        i4 = i3;
                    }
                    recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                    if (recyclerViewAccessibilityDelegate != null) {
                        accessibilityDelegateCompatJ = recyclerViewAccessibilityDelegate.j();
                        if (accessibilityDelegateCompatJ instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                            itemDelegate = (RecyclerViewAccessibilityDelegate.ItemDelegate) accessibilityDelegateCompatJ;
                            accessibilityDelegateCompatE = ViewCompat.e(view);
                            if (accessibilityDelegateCompatE != null) {
                                itemDelegate.e.put(view, accessibilityDelegateCompatE);
                            }
                        }
                        ViewCompat.z(view, accessibilityDelegateCompatJ);
                    }
                } else {
                    i4 = i3;
                }
                if (recyclerView.mState.g) {
                    childViewHolder.mPreLayoutPosition = i;
                }
                i5 = i4;
            } else {
                int iF7 = recyclerView.mAdapterHelper.f(i, 0);
                childViewHolder.mBindingAdapter = null;
                childViewHolder.mOwnerRecyclerView = recyclerView;
                itemViewType = childViewHolder.getItemViewType();
                long nanoTime8 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j6 = this.g.a(itemViewType).d;
                    if (j6 != j4) {
                    }
                }
                recyclerView.mAdapter.bindViewHolder(childViewHolder, iF7);
                nanoTime = recyclerView.getNanoTime() - nanoTime8;
                RecycledViewPool.ScrapData scrapDataA6 = this.g.a(childViewHolder.getItemViewType());
                j5 = scrapDataA6.d;
                if (j5 != j4) {
                    nanoTime = (nanoTime / j3) + ((j5 / j3) * j2);
                }
                scrapDataA6.d = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view = childViewHolder.itemView;
                    WeakHashMap weakHashMap5 = ViewCompat.a;
                    if (view.getImportantForAccessibility() == 0) {
                        i4 = i3;
                        view.setImportantForAccessibility(i4);
                    } else {
                        i4 = i3;
                    }
                    recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                    if (recyclerViewAccessibilityDelegate != null) {
                        accessibilityDelegateCompatJ = recyclerViewAccessibilityDelegate.j();
                        if (accessibilityDelegateCompatJ instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                            itemDelegate = (RecyclerViewAccessibilityDelegate.ItemDelegate) accessibilityDelegateCompatJ;
                            accessibilityDelegateCompatE = ViewCompat.e(view);
                            if (accessibilityDelegateCompatE != null) {
                                itemDelegate.e.put(view, accessibilityDelegateCompatE);
                            }
                        }
                        ViewCompat.z(view, accessibilityDelegateCompatJ);
                    }
                } else {
                    i4 = i3;
                }
                if (recyclerView.mState.g) {
                    childViewHolder.mPreLayoutPosition = i;
                }
                i5 = i4;
            }
            layoutParams = childViewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                childViewHolder.itemView.setLayoutParams(layoutParams2);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                childViewHolder.itemView.setLayoutParams(layoutParams2);
            } else {
                layoutParams2 = (LayoutParams) layoutParams;
            }
            layoutParams2.a = childViewHolder;
            if (i2 != 0) {
                z = 0;
            } else {
                z = 0;
            }
            layoutParams2.d = z;
            return childViewHolder;
        }

        public final void m(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.b.remove(viewHolder);
            } else {
                this.a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        public final void n() {
            LayoutManager layoutManager = RecyclerView.this.mLayout;
            this.f = this.e + (layoutManager != null ? layoutManager.mPrefetchMaxCountObserved : 0);
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
                h(size);
            }
        }

        public Recycler() {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public static void d(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    d((ViewGroup) childAt, true);
                }
            }
            if (!z) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public final void a(ViewHolder viewHolder, boolean z) {
            AccessibilityDelegateCompat accessibilityDelegateCompat;
            RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            View view = viewHolder.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
            if (recyclerViewAccessibilityDelegate != null) {
                AccessibilityDelegateCompat accessibilityDelegateCompatJ = recyclerViewAccessibilityDelegate.j();
                if (accessibilityDelegateCompatJ instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                    accessibilityDelegateCompat = (AccessibilityDelegateCompat) ((RecyclerViewAccessibilityDelegate.ItemDelegate) accessibilityDelegateCompatJ).e.remove(view);
                } else {
                    accessibilityDelegateCompat = null;
                }
                ViewCompat.z(view, accessibilityDelegateCompat);
            }
            if (z) {
                RecyclerListener recyclerListener = recyclerView.mRecyclerListener;
                if (recyclerListener != null) {
                    recyclerListener.a();
                }
                int size = recyclerView.mRecyclerListeners.size();
                for (int i = 0; i < size; i++) {
                    recyclerView.mRecyclerListeners.get(i).a();
                }
                Adapter adapter = recyclerView.mAdapter;
                if (adapter != null) {
                    adapter.onViewRecycled(viewHolder);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(viewHolder);
                }
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            RecycledViewPool recycledViewPoolC = c();
            recycledViewPoolC.getClass();
            int itemViewType = viewHolder.getItemViewType();
            ArrayList arrayList = recycledViewPoolC.a(itemViewType).a;
            if (((RecycledViewPool.ScrapData) recycledViewPoolC.a.get(itemViewType)).b <= arrayList.size()) {
                PoolingContainer.b(viewHolder.itemView);
            } else {
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        public final void i(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            j(childViewHolderInt);
            if (recyclerView.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                recyclerView.mItemAnimator.i(childViewHolderInt);
            }
        }

        /* JADX WARN: Code duplicated, block: B:40:0x0077  */
        /* JADX WARN: Code duplicated, block: B:42:0x0085  */
        /* JADX WARN: Code duplicated, block: B:44:0x008c  */
        /* JADX WARN: Code duplicated, block: B:47:0x0095 A[LOOP:2: B:43:0x008a->B:47:0x0095, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:74:0x0098 A[EDGE_INSN: B:74:0x0098->B:48:0x0098 BREAK  A[LOOP:1: B:39:0x0075->B:46:0x0092], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x0098 A[EDGE_INSN: B:75:0x0098->B:48:0x0098 BREAK  A[LOOP:1: B:39:0x0075->B:46:0x0092, LOOP_LABEL: LOOP:1: B:39:0x0075->B:46:0x0092], SYNTHETIC] */
        public final void j(ViewHolder viewHolder) {
            boolean z;
            int i;
            int i2;
            GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl;
            int i3;
            int i4;
            boolean zIsScrap = viewHolder.isScrap();
            boolean z2 = false;
            boolean z3 = true;
            RecyclerView recyclerView = RecyclerView.this;
            if (!zIsScrap && viewHolder.itemView.getParent() == null) {
                if (!viewHolder.isTmpDetached()) {
                    if (!viewHolder.shouldIgnore()) {
                        boolean zDoesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
                        Adapter adapter = recyclerView.mAdapter;
                        if ((adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder)) || viewHolder.isRecyclable()) {
                            if (this.f > 0 && !viewHolder.hasAnyOfTheFlags(IronSourceError.ERROR_CAPPED_PER_SESSION)) {
                                ArrayList arrayList = this.c;
                                int size = arrayList.size();
                                if (size >= this.f && size > 0) {
                                    h(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                                    GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl2 = recyclerView.mPrefetchRegistry;
                                    int i5 = viewHolder.mPosition;
                                    if (layoutPrefetchRegistryImpl2.c != null) {
                                        int i6 = layoutPrefetchRegistryImpl2.d * 2;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 < i6) {
                                                if (layoutPrefetchRegistryImpl2.c[i7] != i5) {
                                                    i7 += 2;
                                                }
                                            } else {
                                                i = size - 1;
                                                loop1: while (i >= 0) {
                                                    i2 = ((ViewHolder) arrayList.get(i)).mPosition;
                                                    layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
                                                    if (layoutPrefetchRegistryImpl.c != null) {
                                                        break;
                                                    }
                                                    i3 = layoutPrefetchRegistryImpl.d * 2;
                                                    i4 = 0;
                                                    while (true) {
                                                        if (i4 < i3) {
                                                            break loop1;
                                                        } else if (layoutPrefetchRegistryImpl.c[i4] == i2) {
                                                            break;
                                                        } else {
                                                            i4 += 2;
                                                        }
                                                    }
                                                    i--;
                                                }
                                                size = i + 1;
                                            }
                                        }
                                    } else {
                                        i = size - 1;
                                        loop1: while (i >= 0) {
                                            i2 = ((ViewHolder) arrayList.get(i)).mPosition;
                                            layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
                                            if (layoutPrefetchRegistryImpl.c != null) {
                                                break;
                                                break;
                                            }
                                            i3 = layoutPrefetchRegistryImpl.d * 2;
                                            i4 = 0;
                                            while (true) {
                                                if (i4 < i3) {
                                                    break loop1;
                                                    break loop1;
                                                } else if (layoutPrefetchRegistryImpl.c[i4] == i2) {
                                                    break;
                                                } else {
                                                    i4 += 2;
                                                }
                                            }
                                            i--;
                                        }
                                        size = i + 1;
                                    }
                                }
                                arrayList.add(size, viewHolder);
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                a(viewHolder, true);
                            } else {
                                z3 = false;
                            }
                            z2 = z;
                        } else {
                            z3 = false;
                        }
                        recyclerView.mViewInfoStore.d(viewHolder);
                        if (!z2 && !z3 && zDoesTransientStatePreventRecycling) {
                            PoolingContainer.b(viewHolder.itemView);
                            viewHolder.mBindingAdapter = null;
                            viewHolder.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    d.r(nj.n(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
                    return;
                }
                StringBuilder sb = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(viewHolder);
                d.r(nj.n(recyclerView, sb));
                return;
            }
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(viewHolder.isScrap());
            sb2.append(" isAttached:");
            if (viewHolder.itemView.getParent() != null) {
                z2 = true;
            }
            sb2.append(z2);
            sb2.append(recyclerView.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }

        public final void k(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                d.r(nj.n(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                this.a.add(childViewHolderInt);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface RecyclerListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RecyclerViewDataObserver extends AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (recyclerView.mAdapterHelper.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            ArrayList arrayList = adapterHelper.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(adapterHelper.h(4, i, i2, obj));
            adapterHelper.f |= 4;
            if (arrayList.size() == 1) {
                a();
            }
        }

        public final void a() {
            boolean z = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                WeakHashMap weakHashMap = ViewCompat.a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            ArrayList arrayList = adapterHelper.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(adapterHelper.h(1, i, i2, null));
            adapterHelper.f |= 1;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            ArrayList arrayList = adapterHelper.b;
            if (i == i2) {
                return;
            }
            arrayList.add(adapterHelper.h(8, i, i2, null));
            adapterHelper.f |= 8;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            ArrayList arrayList = adapterHelper.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(adapterHelper.h(2, i, i2, null));
            adapterHelper.f |= 2;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (adapter = recyclerView.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }

        public RecyclerViewDataObserver() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void c(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final boolean d(MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void onTouchEvent(MotionEvent motionEvent) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class SmoothScroller {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final Action mRecyclingAction;
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition = -1;
        private View mTargetView;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class Action {
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public final void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f = false;
                    return;
                }
                if (!this.f) {
                    this.g = 0;
                    return;
                }
                Interpolator interpolator = this.e;
                if (interpolator != null && this.c < 1) {
                    e32.i("If you provide an interpolator, you must set a positive duration");
                    return;
                }
                int i2 = this.c;
                if (i2 < 1) {
                    e32.i("Scroll duration must be a positive number");
                    return;
                }
                recyclerView.mViewFlinger.d(this.a, this.b, interpolator, i2);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
            }

            public final void b(int i, int i2, Interpolator interpolator, int i3) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public interface ScrollVectorProvider {
            PointF computeScrollVectorForPosition(int i);
        }

        public abstract void onSeekTargetStep(int i, int i2, State state, Action action);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view, State state, Action action);

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        @Nullable
        public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@NonNull PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i, int i2) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = pointFComputeScrollVectorForPosition.x;
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointFComputeScrollVectorForPosition.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.a(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                Action action = this.mRecyclingAction;
                boolean z = action.d >= 0;
                action.a(recyclerView);
                if (z && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.c();
                }
            }
        }

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public void start(RecyclerView recyclerView, LayoutManager layoutManager) {
            ViewFlinger viewFlinger = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(viewFlinger);
            viewFlinger.c.abortAnimation();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            int i = this.mTargetPosition;
            if (i == -1) {
                d.r("Invalid target position");
                return;
            }
            recyclerView.mState.a = i;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.c();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }

        public SmoothScroller() {
            Action action = new Action();
            action.d = -1;
            action.f = false;
            action.g = 0;
            action.a = 0;
            action.b = 0;
            action.c = Integer.MIN_VALUE;
            action.e = null;
            this.mRecyclingAction = action;
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ScrollVectorProvider.class.getCanonicalName());
            return null;
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class State {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public int l;
        public long m;
        public int n;

        public final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            ak1.j("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.d));
        }

        public final int b() {
            return this.g ? this.b - this.c : this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.c);
            sb.append(", mStructureChanged=");
            sb.append(this.f);
            sb.append(", mInPreLayout=");
            sb.append(this.g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.j);
            sb.append(", mRunPredictiveAnimations=");
            return h50.m(sb, this.k, '}');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class StretchEdgeEffectFactory extends EdgeEffectFactory {
        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        public final EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class ViewCacheExtension {
        public abstract View a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ViewFlinger implements Runnable {
        public int a;
        public int b;
        public OverScroller c;
        public Interpolator d;
        public boolean e;
        public boolean f;

        public final void a(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.b = 0;
            this.a = 0;
            Interpolator interpolator = this.d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.d = interpolator2;
                this.c = new OverScroller(recyclerView.getContext(), interpolator2);
            }
            this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            c();
        }

        public final void c() {
            if (this.e) {
                this.f = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = ViewCompat.a;
            recyclerView.postOnAnimation(this);
        }

        public final void d(int i, int i2, Interpolator interpolator, int i3) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.d != interpolator) {
                this.d = interpolator;
                this.c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.b = 0;
            this.a = 0;
            recyclerView.setScrollState(2);
            this.c.startScroll(0, 0, i, i2, i4);
            c();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.c.abortAnimation();
                return;
            }
            this.f = false;
            this.e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.a;
                int i7 = currY - this.b;
                this.a = currX;
                this.b = currY;
                int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i6);
                int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i7);
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i8 = iArr4[0];
                    int i9 = iArr4[1];
                    int i10 = iConsumeFlingInHorizontalStretch - i8;
                    int i11 = iConsumeFlingInVerticalStretch - i9;
                    SmoothScroller smoothScroller = recyclerView.mLayout.mSmoothScroller;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int iB = recyclerView.mState.b();
                        if (iB == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= iB) {
                            smoothScroller.setTargetPosition(iB - 1);
                            smoothScroller.onAnimation(i8, i9);
                        } else {
                            smoothScroller.onAnimation(i8, i9);
                        }
                    }
                    i = i10;
                    i3 = i8;
                    i2 = i11;
                    i4 = i9;
                } else {
                    i = iConsumeFlingInHorizontalStretch;
                    i2 = iConsumeFlingInVerticalStretch;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i3, i4, i, i2, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i12 = i - iArr6[0];
                int i13 = i2 - iArr6[1];
                if (i3 != 0 || i4 != 0) {
                    recyclerView.dispatchOnScrolled(i3, i4);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                SmoothScroller smoothScroller2 = recyclerView.mLayout.mSmoothScroller;
                if ((smoothScroller2 == null || !smoothScroller2.isPendingInitialRun()) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i12 < 0) {
                            i5 = -currVelocity;
                        } else {
                            i5 = i12 > 0 ? currVelocity : 0;
                        }
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i5, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = layoutPrefetchRegistryImpl.c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        layoutPrefetchRegistryImpl.d = 0;
                    }
                } else {
                    c();
                    GapWorker gapWorker = recyclerView.mGapWorker;
                    if (gapWorker != null) {
                        gapWorker.a(recyclerView, i3, i4);
                    }
                }
            }
            SmoothScroller smoothScroller3 = recyclerView.mLayout.mSmoothScroller;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.e = false;
            if (!this.f) {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap weakHashMap = ViewCompat.a;
                recyclerView.postOnAnimation(this);
            }
        }

        public ViewFlinger() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.d = interpolator;
            this.e = false;
            this.f = false;
            this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public static final /* synthetic */ int d = 0;

        @NonNull
        public final View itemView;
        Adapter<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
                return;
            }
            if ((1024 & this.mFlags) == 0) {
                if (this.mPayloads == null) {
                    ArrayList arrayList = new ArrayList();
                    this.mPayloads = arrayList;
                    this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
                }
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = ViewCompat.a;
            return view.hasTransientState();
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Nullable
        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (this.mFlags & i) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = ViewCompat.a;
            return !view.hasTransientState();
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                View view = this.itemView;
                WeakHashMap weakHashMap = ViewCompat.a;
                this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(Recycler recycler, boolean z) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public void unScrap() {
            this.mScrapContainer.m(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        public ViewHolder(View view) {
            if (view != null) {
                this.itemView = view;
            } else {
                d.r("itemView may not be null");
                throw null;
            }
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sbQ = h50.q(simpleName, "{");
            sbQ.append(Integer.toHexString(hashCode()));
            sbQ.append(" position=");
            sbQ.append(this.mPosition);
            sbQ.append(" id=");
            sbQ.append(this.mItemId);
            sbQ.append(", oldPos=");
            sbQ.append(this.mOldPosition);
            sbQ.append(", pLpos:");
            sbQ.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(sbQ.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private void animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2, boolean z, boolean z2) {
        viewHolder.setIsRecyclable(false);
        if (z) {
            addAnimatingView(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z2) {
                addAnimatingView(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            addAnimatingView(viewHolder);
            this.mRecycler.m(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.mItemAnimator.b(viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(UserDetailsUtils.UserDetailsLiterals.DOT)) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b = -1;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            b = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                b = 0;
            }
        }
        if (i == 1) {
            return b < 0 || (b == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return b > 0 || (b == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return b < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return b > 0;
        }
        StringBuilder sb = new StringBuilder("Invalid direction: ");
        sb.append(i);
        d.r(nj.n(this, sb));
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ensureRightGlow();
                EdgeEffectCompat.b(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
            } else {
                z = false;
            }
            if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ensureTopGlow();
                EdgeEffectCompat.b(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ensureBottomGlow();
                EdgeEffectCompat.b(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z2 = z;
            }
            if (z2 && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            WeakHashMap weakHashMap = ViewCompat.a;
            postInvalidateOnAnimation();
        }
        ensureLeftGlow();
        EdgeEffectCompat.b(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        z = true;
        if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ensureTopGlow();
            EdgeEffectCompat.b(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
        } else if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ensureBottomGlow();
            EdgeEffectCompat.b(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
        } else {
            z2 = z;
        }
        if (z2) {
        }
        WeakHashMap weakHashMap2 = ViewCompat.a;
        postInvalidateOnAnimation();
    }

    private boolean shouldAbsorb(@NonNull EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        return getSplineFlingDistance(-i) < EdgeEffectCompat.a(edgeEffect) * ((float) i2);
    }

    public void animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.a(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    @Nullable
    public ViewHolder findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(@Px int i, @Px int i2) {
    }

    public void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, 8192);
        if (this.mState.h && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.mViewInfoStore.b.f(getChangedHolderKey(viewHolder), viewHolder);
        }
        SimpleArrayMap simpleArrayMap = this.mViewInfoStore.a;
        ViewInfoStore.InfoRecord infoRecordA = (ViewInfoStore.InfoRecord) simpleArrayMap.get(viewHolder);
        if (infoRecordA == null) {
            infoRecordA = ViewInfoStore.InfoRecord.a();
            simpleArrayMap.put(viewHolder, infoRecordA);
        }
        infoRecordA.b = itemHolderInfo;
        infoRecordA.a |= 4;
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public void swapAdapter(@Nullable Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class AdapterDataObserver {
        public void onChanged() {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onItemRangeChanged(i, i2);
        }

        public void onItemRangeChanged(int i, int i2) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ItemAnimatorRestoreListener implements ItemAnimator.ItemAnimatorListener {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        public final void a(ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (viewHolder.shouldBeKeptAsChild()) {
                return;
            }
            View view = viewHolder.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.removeAnimatingView(view) || !viewHolder.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(viewHolder.itemView, false);
        }

        public ItemAnimatorRestoreListener() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class ItemDecoration {
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).a.getLayoutPosition(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDrawOver(canvas, recyclerView);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final /* synthetic */ int e = 0;
        public ViewHolder a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public Parcelable c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }
    }

    private void addAnimatingView(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.m(getChildViewHolder(view));
        boolean zIsTmpDetached = viewHolder.isTmpDetached();
        ChildHelper childHelper = this.mChildHelper;
        if (zIsTmpDetached) {
            childHelper.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            RecyclerView recyclerView = RecyclerView.this;
            int childCount = recyclerView.getChildCount();
            childHelper.b.e(childCount, true);
            childHelper.c.add(view);
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(recyclerView);
            }
            recyclerView.addView(view, childCount);
            recyclerView.dispatchChildAttached(view);
            return;
        }
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild < 0) {
            vq2.r(view, "view is not a child, cannot hide ");
            return;
        }
        childHelper.b.h(iIndexOfChild);
        childHelper.c.add(view);
        AnonymousClass5 anonymousClass5 = childHelper.a;
        ViewHolder childViewHolderInt2 = getChildViewHolderInt(view);
        if (childViewHolderInt2 != null) {
            childViewHolderInt2.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && EdgeEffectCompat.a(edgeEffect) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int iRound = Math.round(EdgeEffectCompat.b(edgeEffect, ((-i) * FLING_DESTRETCH_FACTOR) / i2, 0.5f) * ((-i2) / FLING_DESTRETCH_FACTOR));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || EdgeEffectCompat.a(edgeEffect2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(EdgeEffectCompat.b(edgeEffect2, (i * FLING_DESTRETCH_FACTOR) / f, 0.5f) * (f / FLING_DESTRETCH_FACTOR));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LayoutManager.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((LayoutManager) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                e32.f(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", fullClassName, e3);
            } catch (ClassNotFoundException e4) {
                e32.f(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", fullClassName, e4);
            } catch (IllegalAccessException e5) {
                e32.f(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", fullClassName, e5);
            } catch (InstantiationException e6) {
                e32.f(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", fullClassName, e6);
            } catch (InvocationTargetException e7) {
                e32.f(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", fullClassName, e7);
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        accessibilityEventObtain.setContentChangeTypes(i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        ViewInfoStore.InfoRecord infoRecord;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        ViewInfoStore viewInfoStore = this.mViewInfoStore;
        viewInfoStore.a.clear();
        viewInfoStore.b.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        State state = this.mState;
        state.h = state.j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        state.g = state.k;
        state.e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int iC = this.mChildHelper.c();
            for (int i = 0; i < iC; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    ItemAnimator itemAnimator = this.mItemAnimator;
                    ItemAnimator.e(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    itemAnimator.getClass();
                    ItemAnimator.ItemHolderInfo itemHolderInfo = new ItemAnimator.ItemHolderInfo();
                    itemHolderInfo.a(childViewHolderInt);
                    SimpleArrayMap simpleArrayMap = this.mViewInfoStore.a;
                    ViewInfoStore.InfoRecord infoRecordA = (ViewInfoStore.InfoRecord) simpleArrayMap.get(childViewHolderInt);
                    if (infoRecordA == null) {
                        infoRecordA = ViewInfoStore.InfoRecord.a();
                        simpleArrayMap.put(childViewHolderInt, infoRecordA);
                    }
                    infoRecordA.b = itemHolderInfo;
                    infoRecordA.a |= 4;
                    if (this.mState.h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.b.f(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.k) {
            saveOldPositions();
            State state2 = this.mState;
            boolean z = state2.f;
            state2.f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, state2);
            this.mState.f = z;
            for (int i2 = 0; i2 < this.mChildHelper.c(); i2++) {
                ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.b(i2));
                if (!childViewHolderInt2.shouldIgnore() && ((infoRecord = (ViewInfoStore.InfoRecord) this.mViewInfoStore.a.get(childViewHolderInt2)) == null || (infoRecord.a & 4) == 0)) {
                    ItemAnimator.e(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    ItemAnimator itemAnimator2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    itemAnimator2.getClass();
                    ItemAnimator.ItemHolderInfo itemHolderInfo2 = new ItemAnimator.ItemHolderInfo();
                    itemHolderInfo2.a(childViewHolderInt2);
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, itemHolderInfo2);
                    } else {
                        SimpleArrayMap simpleArrayMap2 = this.mViewInfoStore.a;
                        ViewInfoStore.InfoRecord infoRecordA2 = (ViewInfoStore.InfoRecord) simpleArrayMap2.get(childViewHolderInt2);
                        if (infoRecordA2 == null) {
                            infoRecordA2 = ViewInfoStore.InfoRecord.a();
                            simpleArrayMap2.put(childViewHolderInt2, infoRecordA2);
                        }
                        infoRecordA2.a |= 2;
                        infoRecordA2.b = itemHolderInfo2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.d = 2;
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        State state = this.mState;
        state.d = 1;
        if (state.j) {
            int iC = this.mChildHelper.c() - 1;
            while (iC >= 0) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(iC));
                if (childViewHolderInt.shouldIgnore()) {
                    recyclerView2 = this;
                } else {
                    long changedHolderKey = this.getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    ItemAnimator.ItemHolderInfo itemHolderInfo = new ItemAnimator.ItemHolderInfo();
                    itemHolderInfo.a(childViewHolderInt);
                    ViewHolder viewHolder = (ViewHolder) this.mViewInfoStore.b.c(changedHolderKey);
                    if (viewHolder == null || viewHolder.shouldIgnore()) {
                        recyclerView2 = this;
                        recyclerView2.mViewInfoStore.a(childViewHolderInt, itemHolderInfo);
                    } else {
                        ViewInfoStore.InfoRecord infoRecord = (ViewInfoStore.InfoRecord) this.mViewInfoStore.a.get(viewHolder);
                        boolean z = (infoRecord == null || (infoRecord.a & 1) == 0) ? false : true;
                        ViewInfoStore.InfoRecord infoRecord2 = (ViewInfoStore.InfoRecord) this.mViewInfoStore.a.get(childViewHolderInt);
                        boolean z2 = (infoRecord2 == null || (infoRecord2.a & 1) == 0) ? false : true;
                        if (z && viewHolder == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, itemHolderInfo);
                        } else {
                            ItemAnimator.ItemHolderInfo itemHolderInfoB = this.mViewInfoStore.b(viewHolder, 4);
                            this.mViewInfoStore.a(childViewHolderInt, itemHolderInfo);
                            ItemAnimator.ItemHolderInfo itemHolderInfoB2 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (itemHolderInfoB == null) {
                                this.handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, viewHolder);
                            } else {
                                recyclerView2 = this;
                                recyclerView2.animateChange(viewHolder, childViewHolderInt, itemHolderInfoB, itemHolderInfoB2, z, z2);
                            }
                        }
                        recyclerView2 = this;
                    }
                }
                iC--;
                this = recyclerView2;
            }
            recyclerView = this;
            ViewInfoStore viewInfoStore = recyclerView.mViewInfoStore;
            ViewInfoStore.ProcessCallback processCallback = recyclerView.mViewInfoProcessCallback;
            SimpleArrayMap simpleArrayMap = viewInfoStore.a;
            for (int i = simpleArrayMap.c - 1; i >= 0; i--) {
                ViewHolder viewHolder2 = (ViewHolder) simpleArrayMap.f(i);
                ViewInfoStore.InfoRecord infoRecord3 = (ViewInfoStore.InfoRecord) simpleArrayMap.g(i);
                int i2 = infoRecord3.a;
                if ((i2 & 3) == 3) {
                    processCallback.b(viewHolder2);
                } else if ((i2 & 1) != 0) {
                    ItemAnimator.ItemHolderInfo itemHolderInfo2 = infoRecord3.b;
                    if (itemHolderInfo2 == null) {
                        processCallback.b(viewHolder2);
                    } else {
                        processCallback.c(viewHolder2, itemHolderInfo2, infoRecord3.c);
                    }
                } else if ((i2 & 14) == 14) {
                    processCallback.a(viewHolder2, infoRecord3.b, infoRecord3.c);
                } else if ((i2 & 12) == 12) {
                    processCallback.d(viewHolder2, infoRecord3.b, infoRecord3.c);
                } else if ((i2 & 4) != 0) {
                    processCallback.c(viewHolder2, infoRecord3.b, null);
                } else if ((i2 & 8) != 0) {
                    processCallback.a(viewHolder2, infoRecord3.b, infoRecord3.c);
                }
                infoRecord3.a = 0;
                infoRecord3.b = null;
                infoRecord3.c = null;
                ViewInfoStore.InfoRecord.d.b(infoRecord3);
            }
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.removeAndRecycleScrapInt(recyclerView.mRecycler);
        State state2 = recyclerView.mState;
        state2.b = state2.e;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        state2.j = false;
        state2.k = false;
        recyclerView.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = recyclerView.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = recyclerView.mLayout;
        if (layoutManager.mPrefetchMaxObservedInInitialPrefetch) {
            layoutManager.mPrefetchMaxCountObserved = 0;
            layoutManager.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.mRecycler.n();
        }
        recyclerView.mLayout.onLayoutCompleted(recyclerView.mState);
        recyclerView.onExitLayoutOrScroll();
        recyclerView.stopInterceptRequestLayout(false);
        ViewInfoStore viewInfoStore2 = recyclerView.mViewInfoStore;
        viewInfoStore2.a.clear();
        viewInfoStore2.b.a();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (recyclerView.didChildRangeChange(iArr[0], iArr[1])) {
            recyclerView.dispatchOnScrolled(0, 0);
        }
        recyclerView.recoverFocusFromState();
        recyclerView.resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
        if (onItemTouchListener == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        onItemTouchListener.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iC = this.mChildHelper.c();
        if (iC == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iC; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @Nullable
    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    @Nullable
    private View findNextViewToFocus() {
        ViewHolder viewHolderFindViewHolderForAdapterPosition;
        State state = this.mState;
        int i = state.l;
        if (i == -1) {
            i = 0;
        }
        int iB = state.b();
        for (int i2 = i; i2 < iB; i2++) {
            ViewHolder viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (viewHolderFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return viewHolderFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iB, i);
        do {
            iMin--;
            if (iMin < 0 || (viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return viewHolderFindViewHolderForAdapterPosition.itemView;
    }

    public static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).a;
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, ViewHolder viewHolder, ViewHolder viewHolder2) {
        int iC = this.mChildHelper.c();
        for (int i = 0; i < iC; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i));
            if (childViewHolderInt != viewHolder && getChangedHolderKey(childViewHolderInt) == j) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(viewHolder);
                    e32.i(nj.n(this, sb));
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(viewHolder);
                e32.i(nj.n(this, sb2));
                return;
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + viewHolder2 + " cannot be found but it is necessary for " + viewHolder + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iC = this.mChildHelper.c();
        for (int i = 0; i < iC; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initChildrenHelper() {
        this.mChildHelper = new ChildHelper(new AnonymousClass5());
    }

    private void nestedScrollByInternal(int i, int i2, @Nullable MotionEvent motionEvent, int i3) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i4 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i - releaseHorizontalGlow(i, height);
        int iReleaseVerticalGlow = i2 - releaseVerticalGlow(i2, width);
        startNestedScroll(i4, i3);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, i3);
        GapWorker gapWorker = this.mGapWorker;
        if (gapWorker != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            gapWorker.a(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i3);
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            AdapterHelper adapterHelper = this.mAdapterHelper;
            adapterHelper.k(adapterHelper.b);
            adapterHelper.k(adapterHelper.c);
            adapterHelper.f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        boolean zPredictiveItemAnimationsEnabled = predictiveItemAnimationsEnabled();
        AdapterHelper adapterHelper2 = this.mAdapterHelper;
        if (zPredictiveItemAnimationsEnabled) {
            adapterHelper2.j();
        } else {
            adapterHelper2.c();
        }
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        State state = this.mState;
        if (state.j && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        state.k = z2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.c.contains(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.c() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        ViewHolder viewHolderFindViewHolderForItemId = (this.mState.m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.m);
        if (viewHolderFindViewHolderForItemId != null) {
            if (!this.mChildHelper.c.contains(viewHolderFindViewHolderForItemId.itemView) && viewHolderFindViewHolderForItemId.itemView.hasFocusable()) {
                viewFindNextViewToFocus = viewHolderFindViewHolderForItemId.itemView;
            } else if (this.mChildHelper.c() > 0) {
                viewFindNextViewToFocus = findNextViewToFocus();
            }
        } else if (this.mChildHelper.c() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i = this.mState.n;
            if (i != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = ViewCompat.a;
            postInvalidateOnAnimation();
        }
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.c) {
                Rect rect = layoutParams2.b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        State state = this.mState;
        state.m = -1L;
        state.l = -1;
        state.n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        ViewHolder viewHolderFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (viewHolderFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.m = this.mAdapter.hasStableIds() ? viewHolderFindContainingViewHolder.getItemId() : -1L;
        State state = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = viewHolderFindContainingViewHolder.isRemoved() ? viewHolderFindContainingViewHolder.mOldPosition : viewHolderFindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        state.l = absoluteAdapterPosition;
        this.mState.n = getDeepestFocusedViewWithId(viewHolderFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@Nullable Adapter<?> adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        AdapterHelper adapterHelper = this.mAdapterHelper;
        adapterHelper.k(adapterHelper.b);
        adapterHelper.k(adapterHelper.c);
        adapterHelper.f = 0;
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(adapter3, this.mAdapter);
        }
        Recycler recycler = this.mRecycler;
        Adapter adapter4 = this.mAdapter;
        recycler.a.clear();
        recycler.g();
        recycler.f(adapter3, true);
        RecycledViewPool recycledViewPoolC = recycler.c();
        if (adapter3 != null) {
            recycledViewPoolC.b--;
        }
        if (!z && recycledViewPoolC.b == 0) {
            SparseArray sparseArray = recycledViewPoolC.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                RecycledViewPool.ScrapData scrapData = (RecycledViewPool.ScrapData) sparseArray.valueAt(i);
                ArrayList arrayList = scrapData.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    PoolingContainer.b(((ViewHolder) obj).itemView);
                }
                scrapData.a.clear();
            }
        }
        if (adapter4 != null) {
            recycledViewPoolC.b++;
        } else {
            recycledViewPoolC.getClass();
        }
        recycler.e();
        this.mState.f = true;
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || EdgeEffectCompat.a(edgeEffect) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || canScrollHorizontally(-1)) {
            z = false;
        } else {
            EdgeEffectCompat.b(this.mLeftGlow, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && EdgeEffectCompat.a(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollHorizontally(1)) {
            EdgeEffectCompat.b(this.mRightGlow, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && EdgeEffectCompat.a(edgeEffect3) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollVertically(-1)) {
            EdgeEffectCompat.b(this.mTopGlow, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || EdgeEffectCompat.a(edgeEffect4) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || canScrollVertically(1)) {
            return z;
        }
        EdgeEffectCompat.b(this.mBottomGlow, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        ViewFlinger viewFlinger = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(viewFlinger);
        viewFlinger.c.abortAnimation();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration, int i) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        ArrayList<ItemDecoration> arrayList = this.mItemDecorations;
        if (i < 0) {
            arrayList.add(itemDecoration);
        } else {
            arrayList.add(i, itemDecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(onChildAttachStateChangeListener);
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void addRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        Preconditions.a("'listener' arg cannot be null.", recyclerListener != null);
        this.mRecyclerListeners.add(recyclerListener);
    }

    public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator == null || itemAnimator.g(viewHolder, viewHolder.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    public void clearOldPositions() {
        int childCount = RecyclerView.this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.a;
        ArrayList arrayList2 = recycler.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ViewHolder) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ViewHolder) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = recycler.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((ViewHolder) recycler.b.get(i4)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = ViewCompat.a;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return consumeFlingInStretch(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return consumeFlingInStretch(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = TraceCompat.a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            AdapterHelper adapterHelper = this.mAdapterHelper;
            int i2 = adapterHelper.f;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (adapterHelper.g()) {
                    int i3 = TraceCompat.a;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = TraceCompat.a;
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.j();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.i = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            AdapterHelper adapterHelper = this.mAdapterHelper;
            if ((adapterHelper.c.isEmpty() || adapterHelper.b.isEmpty()) && !z && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    public void dispatchOnScrollStateChanged(int i) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i, i2);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        int size = this.mPendingAccessibilityImportanceChange.size();
        while (true) {
            size--;
            List<ViewHolder> list = this.mPendingAccessibilityImportanceChange;
            if (size < 0) {
                list.clear();
                return;
            }
            ViewHolder viewHolder = list.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                View view = viewHolder.itemView;
                WeakHashMap weakHashMap = ViewCompat.a;
                view.setImportantForAccessibility(i);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mBottomGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mLeftGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mRightGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mTopGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    @Nullable
    public View findChildViewUnder(float f, float f2) {
        for (int iC = this.mChildHelper.c() - 1; iC >= 0; iC--) {
            View viewB = this.mChildHelper.b(iC);
            float translationX = viewB.getTranslationX();
            float translationY = viewB.getTranslationY();
            if (f >= viewB.getLeft() + translationX && f <= viewB.getRight() + translationX && f2 >= viewB.getTop() + translationY && f2 <= viewB.getBottom() + translationY) {
                return viewB;
            }
        }
        return null;
    }

    @Nullable
    public ViewHolder findViewHolderForAdapterPosition(int i) {
        ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int childCount = RecyclerView.this.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                ChildHelper childHelper = this.mChildHelper;
                if (!childHelper.c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                viewHolder = childViewHolderInt;
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForItemId(long j) {
        Adapter adapter = this.mAdapter;
        ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int childCount = RecyclerView.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    ChildHelper childHelper = this.mChildHelper;
                    if (!childHelper.c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[SYNTHETIC] */
    @Nullable
    public ViewHolder findViewHolderForPosition(int i, boolean z) {
        ChildHelper childHelper;
        int childCount = RecyclerView.this.getChildCount();
        ViewHolder viewHolder = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    } else {
                        childHelper = this.mChildHelper;
                        if (childHelper.c.contains(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        viewHolder = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                } else {
                    childHelper = this.mChildHelper;
                    if (childHelper.c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public boolean fling(int i, int i2) {
        int iMax;
        int i3;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || EdgeEffectCompat.a(edgeEffect) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || EdgeEffectCompat.a(edgeEffect2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    iMax = 0;
                } else if (shouldAbsorb(this.mRightGlow, i, getWidth())) {
                    this.mRightGlow.onAbsorb(i);
                    i = 0;
                }
            } else {
                int i4 = -i;
                if (shouldAbsorb(this.mLeftGlow, i4, getWidth())) {
                    this.mLeftGlow.onAbsorb(i4);
                    i = 0;
                }
            }
            iMax = i;
            i = 0;
        }
        if (i2 == 0) {
            i3 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || EdgeEffectCompat.a(edgeEffect3) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || EdgeEffectCompat.a(edgeEffect4) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i3 = i2;
                    i2 = 0;
                } else if (shouldAbsorb(this.mBottomGlow, i2, getHeight())) {
                    this.mBottomGlow.onAbsorb(i2);
                    i2 = 0;
                }
            } else {
                int i5 = -i2;
                if (shouldAbsorb(this.mTopGlow, i5, getHeight())) {
                    this.mTopGlow.onAbsorb(i5);
                    i2 = 0;
                }
            }
            i3 = 0;
        }
        if (iMax != 0 || i2 != 0) {
            int i6 = this.mMaxFlingVelocity;
            iMax = Math.max(-i6, Math.min(iMax, i6));
            int i7 = this.mMaxFlingVelocity;
            i2 = Math.max(-i7, Math.min(i2, i7));
            this.mViewFlinger.a(iMax, i2);
        }
        if (i == 0 && i3 == 0) {
            return (iMax == 0 && i2 == 0) ? false : true;
        }
        float f = i;
        float f2 = i3;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            OnFlingListener onFlingListener = this.mOnFlingListener;
            if (onFlingListener != null && onFlingListener.onFling(i, i3)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i8 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i8, Math.min(i, i8));
                int i9 = this.mMaxFlingVelocity;
                this.mViewFlinger.a(iMax2, Math.max(-i9, Math.min(i3, i9)));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewOnFocusSearchFailed;
        boolean z;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (!z2 || (i != 2 && i != 1)) {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) != null) {
                    startInterceptRequestLayout();
                    viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                    stopInterceptRequestLayout(false);
                }
                return null;
            }
            viewOnFocusSearchFailed = viewFindNextFocus;
            if (viewOnFocusSearchFailed != null || viewOnFocusSearchFailed.hasFocusable()) {
                if (isPreferredNextFocus(view, viewOnFocusSearchFailed, i)) {
                    return viewOnFocusSearchFailed;
                }
                return super.focusSearch(view, i);
            }
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            requestChildOnScreen(viewOnFocusSearchFailed, null);
            return view;
        }
        if (this.mLayout.canScrollVertically()) {
            int i2 = i == 2 ? 130 : 33;
            z = focusFinder.findNextFocus(this, view, i2) == null;
            if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                i = i2;
            }
        } else {
            z = false;
        }
        if (!z && this.mLayout.canScrollHorizontally()) {
            int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
            boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
            if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                i = i3;
            }
            z = z3;
        }
        if (z) {
            consumePendingUpdateOperations();
            if (findContainingItemView(view) != null) {
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            return null;
        }
        viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i);
        if (viewOnFocusSearchFailed != null) {
        }
        if (isPreferredNextFocus(view, viewOnFocusSearchFailed, i)) {
            return viewOnFocusSearchFailed;
        }
        return super.focusSearch(view, i);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        e32.i(nj.n(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        e32.i(nj.n(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(IronSourceError.ERROR_PLACEMENT_CAPPED) || !viewHolder.isBound()) {
            return -1;
        }
        AdapterHelper adapterHelper = this.mAdapterHelper;
        int i = viewHolder.mPosition;
        ArrayList arrayList = adapterHelper.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AdapterHelper.UpdateOp updateOp = (AdapterHelper.UpdateOp) arrayList.get(i2);
            int i3 = updateOp.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = updateOp.b;
                    if (i4 <= i) {
                        int i5 = updateOp.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = updateOp.b;
                    if (i6 == i) {
                        i = updateOp.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (updateOp.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (updateOp.b <= i) {
                i += updateOp.d;
            }
        }
        return i;
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.mLayout;
        return layoutManager != null ? layoutManager.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(ViewHolder viewHolder) {
        return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.mChildDrawingOrderCallback;
        if (childDrawingOrderCallback == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        childDrawingOrderCallback.a();
        throw null;
    }

    public long getChildItemId(@NonNull View view) {
        ViewHolder childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new AnonymousClass6());
    }

    @VisibleForTesting
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            d.r(nj.n(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        } else {
            Resources resources = getContext().getResources();
            new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
        }
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.k();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int childCount = RecyclerView.this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((LayoutParams) RecyclerView.this.getChildAt(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.mRecycler.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) ((ViewHolder) arrayList.get(i2)).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int childCount = RecyclerView.this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i2);
            if (viewHolder != null) {
                viewHolder.addFlags(6);
                viewHolder.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.mAdapter;
        if (adapter == null || !adapter.hasStableIds()) {
            recycler.g();
        }
    }

    public void offsetChildrenHorizontal(@Px int i) {
        int iC = this.mChildHelper.c();
        for (int i2 = 0; i2 < iC; i2++) {
            this.mChildHelper.b(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(@Px int i) {
        int iC = this.mChildHelper.c();
        for (int i2 = 0; i2 < iC; i2++) {
            this.mChildHelper.b(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int childCount = RecyclerView.this.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i4);
            if (viewHolder != null && viewHolder.mPosition >= i) {
                viewHolder.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount = RecyclerView.this.getChildCount();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i11));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i10 = 1;
            i7 = i2;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i12);
            if (viewHolder != null && (i8 = viewHolder.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    viewHolder.offsetPosition(i2 - i, false);
                } else {
                    viewHolder.offsetPosition(i10, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int childCount = RecyclerView.this.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f = true;
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f = true;
                }
            }
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
            if (viewHolder != null) {
                int i6 = viewHolder.mPosition;
                if (i6 >= i3) {
                    viewHolder.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    viewHolder.addFlags(8);
                    recycler.h(size);
                }
            }
        }
        requestLayout();
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue2;
                } else if (this.mLayout.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || axisValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zCanScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = TraceCompat.a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (layoutManager.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.i = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            State state = this.mState;
            if (state.k) {
                state.g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        State state2 = this.mState;
        if (adapter != null) {
            state2.e = adapter.getItemCount();
        } else {
            state2.e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.g = false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.a);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.c = savedState2.c;
            return savedState;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            savedState.c = layoutManager.onSaveInstanceState();
            return savedState;
        }
        savedState.c = null;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00da A[PHI: r1
  0x00da: PHI (r1v45 int) = (r1v25 int), (r1v49 int) binds: [B:41:0x00c5, B:46:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                resetScroll();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.mLastTouchX - x;
                int iMax2 = this.mLastTouchY - y;
                if (this.mScrollState != 1) {
                    if (zCanScrollHorizontally) {
                        int i2 = this.mTouchSlop;
                        iMax = iMax > 0 ? Math.max(0, iMax - i2) : Math.min(0, iMax + i2);
                        if (iMax != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (zCanScrollVertically) {
                        int i3 = this.mTouchSlop;
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i3) : Math.min(0, iMax2 + i3);
                        if (iMax2 != 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        setScrollState(1);
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iReleaseHorizontalGlow = iMax - releaseHorizontalGlow(iMax, motionEvent.getY());
                    int iReleaseVerticalGlow = iMax2 - releaseVerticalGlow(iMax2, motionEvent.getX());
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        iReleaseHorizontalGlow -= iArr4[0];
                        iReleaseVerticalGlow -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i4 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i4 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x - iArr7[0];
                    this.mLastTouchY = y - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    GapWorker gapWorker = this.mGapWorker;
                    if (gapWorker != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
                        gapWorker.a(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x2;
                this.mInitialTouchX = x2;
                int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y2;
                this.mInitialTouchY = y2;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.mScrollPointerId = motionEvent.getPointerId(0);
        int x3 = (int) (motionEvent.getX() + 0.5f);
        this.mLastTouchX = x3;
        this.mInitialTouchX = x3;
        int y3 = (int) (motionEvent.getY() + 0.5f);
        this.mLastTouchY = y3;
        this.mInitialTouchY = y3;
        if (zCanScrollVertically) {
            i = zCanScrollHorizontally;
            i = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        i = zCanScrollHorizontally;
        startNestedScroll(i, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = ViewCompat.a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void removeAndRecycleViews() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.j();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        Recycler recycler = this.mRecycler;
        recycler.a.clear();
        recycler.g();
    }

    public void removeItemDecoration(@NonNull ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(itemDecoration);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(onChildAttachStateChangeListener);
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        this.mRecyclerListeners.remove(recyclerListener);
    }

    public void repositionShadowingViews() {
        ViewHolder viewHolder;
        int iC = this.mChildHelper.c();
        for (int i = 0; i < iC; i++) {
            View viewB = this.mChildHelper.b(i);
            ViewHolder childViewHolder = getChildViewHolder(viewB);
            if (childViewHolder != null && (viewHolder = childViewHolder.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = viewB.getLeft();
                int top = viewB.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int childCount = RecyclerView.this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i6 = i - i8;
            i7 = i2 - i9;
            i5 = i9;
            i4 = i8;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i5, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i4 != 0 || i5 != 0) {
            dispatchOnScrolled(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i5 == 0) ? false : true;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        ViewCompat.z(this, recyclerViewAccessibilityDelegate);
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = childDrawingOrderCallback;
        setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.j();
            this.mItemAnimator.a = null;
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        Recycler recycler = this.mRecycler;
        recycler.e = i;
        recycler.n();
    }

    public void setLayoutManager(@Nullable LayoutManager layoutManager) {
        AnonymousClass5 anonymousClass5;
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            ItemAnimator itemAnimator = this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.j();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            Recycler recycler = this.mRecycler;
            recycler.a.clear();
            recycler.g();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            Recycler recycler2 = this.mRecycler;
            recycler2.a.clear();
            recycler2.g();
        }
        ChildHelper childHelper = this.mChildHelper;
        childHelper.b.g();
        ArrayList arrayList = childHelper.c;
        int size = arrayList.size();
        while (true) {
            size--;
            anonymousClass5 = childHelper.a;
            if (size < 0) {
                break;
            }
            anonymousClass5.a((View) arrayList.get(size));
            arrayList.remove(size);
        }
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(layoutManager);
                sb.append(" is already attached to a RecyclerView:");
                d.r(nj.n(layoutManager.mRecyclerView, sb));
                return;
            }
            layoutManager.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            d.r("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recycledViewPool) {
        Recycler recycler = this.mRecycler;
        RecyclerView recyclerView = RecyclerView.this;
        recycler.f(recyclerView.mAdapter, false);
        RecycledViewPool recycledViewPool2 = recycler.g;
        if (recycledViewPool2 != null) {
            recycledViewPool2.b--;
        }
        recycler.g = recycledViewPool;
        if (recycledViewPool != null && recyclerView.getAdapter() != null) {
            recycler.g.b++;
        }
        recycler.e();
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerListener) {
        this.mRecyclerListener = recyclerListener;
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension viewCacheExtension) {
        this.mRecycler.h = viewCacheExtension;
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3, boolean z) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != Integer.MIN_VALUE && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            startNestedScroll(i4, 1);
        }
        this.mViewFlinger.d(i, i2, interpolator, i3);
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.smoothScrollToPosition(this, this.mState, i);
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int childCount = RecyclerView.this.getChildCount();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = RecyclerView.this.getChildAt(i6);
            ViewHolder childViewHolderInt = getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) childAt.getLayoutParams()).c = true;
            }
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
            if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i5) {
                viewHolder.addFlags(2);
                recycler.h(size);
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new AnonymousClass3();
        sDefaultEdgeEffectFactory = new StretchEdgeEffectFactory();
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        boolean z;
        super(context, attributeSet, i);
        this.mObserver = new RecyclerViewDataObserver();
        this.mRecycler = new Recycler();
        this.mViewInfoStore = new ViewInfoStore();
        this.mUpdateChildViewsRunnable = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.1
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView = RecyclerView.this;
                if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView.mIsAttached) {
                    recyclerView.requestLayout();
                } else if (recyclerView.mLayoutSuppressed) {
                    recyclerView.mLayoutWasDefered = true;
                } else {
                    recyclerView.consumePendingUpdateOperations();
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.a = null;
        defaultItemAnimator.b = new ArrayList();
        defaultItemAnimator.c = 120L;
        defaultItemAnimator.d = 120L;
        defaultItemAnimator.e = 250L;
        defaultItemAnimator.f = 250L;
        defaultItemAnimator.g = true;
        defaultItemAnimator.h = new ArrayList();
        defaultItemAnimator.i = new ArrayList();
        defaultItemAnimator.j = new ArrayList();
        defaultItemAnimator.k = new ArrayList();
        defaultItemAnimator.l = new ArrayList();
        defaultItemAnimator.m = new ArrayList();
        defaultItemAnimator.n = new ArrayList();
        defaultItemAnimator.o = new ArrayList();
        defaultItemAnimator.p = new ArrayList();
        defaultItemAnimator.q = new ArrayList();
        defaultItemAnimator.r = new ArrayList();
        this.mItemAnimator = defaultItemAnimator;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new ViewFlinger();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new GapWorker.LayoutPrefetchRegistryImpl() : null;
        State state = new State();
        state.a = -1;
        state.b = 0;
        state.c = 0;
        state.d = 1;
        state.e = 0;
        state.f = false;
        state.g = false;
        state.h = false;
        state.i = false;
        state.j = false;
        state.k = false;
        this.mState = state;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new ItemAnimatorRestoreListener();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.2
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView = RecyclerView.this;
                ItemAnimator itemAnimator = recyclerView.mItemAnimator;
                if (itemAnimator != null) {
                    itemAnimator.l();
                }
                recyclerView.mPostedAnimatorRunner = false;
            }
        };
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new ViewInfoStore.ProcessCallback() { // from class: androidx.recyclerview.widget.RecyclerView.4
            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public final void d(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                viewHolder.setIsRecyclable(false);
                RecyclerView recyclerView = RecyclerView.this;
                boolean z2 = recyclerView.mDataSetHasChangedAfterLayout;
                ItemAnimator itemAnimator = recyclerView.mItemAnimator;
                if (z2) {
                    if (itemAnimator.b(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                        recyclerView.postAnimationRunner();
                    }
                } else if (itemAnimator.d(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    recyclerView.postAnimationRunner();
                }
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public final void a(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                RecyclerView.this.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public final void b(ViewHolder viewHolder) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.removeAndRecycleView(viewHolder.itemView, recyclerView.mRecycler);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public final void c(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mRecycler.m(viewHolder);
                recyclerView.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = ViewConfigurationCompat.b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = ViewConfigurationCompat.d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.mItemAnimator.a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap weakHashMap = ViewCompat.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i, 0);
        ViewCompat.y(this, context, androidx.recyclerview.R.styleable.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(Constants.REFERRER_LINK_MAX_RESPONSE_CHARS);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.y(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
        setTag(com.ecffri.arrows.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    private void dispatchLayoutStep2() {
        boolean z;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.e = this.mAdapter.getItemCount();
        this.mState.c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.c;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        State state = this.mState;
        state.g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, state);
        State state2 = this.mState;
        state2.f = false;
        if (state2.j && this.mItemAnimator != null) {
            z = true;
        } else {
            z = false;
        }
        state2.j = z;
        state2.d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i);
            if (onItemTouchListener.d(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private float getSplineFlingDistance(int i) {
        double dLog = Math.log((Math.abs(i) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f = DECELERATION_RATE;
        return (float) (Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)));
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (ViewCompat.l(this) == 0) {
            ViewCompat.F(this, 8);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private int releaseHorizontalGlow(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (edgeEffect != null && EdgeEffectCompat.a(edgeEffect) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            boolean zCanScrollHorizontally = canScrollHorizontally(-1);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (zCanScrollHorizontally) {
                edgeEffect2.onRelease();
            } else {
                float f3 = -EdgeEffectCompat.b(edgeEffect2, -width, 1.0f - height);
                if (EdgeEffectCompat.a(this.mLeftGlow) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect3 = this.mRightGlow;
            if (edgeEffect3 != null && EdgeEffectCompat.a(edgeEffect3) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                boolean zCanScrollHorizontally2 = canScrollHorizontally(1);
                EdgeEffect edgeEffect4 = this.mRightGlow;
                if (zCanScrollHorizontally2) {
                    edgeEffect4.onRelease();
                } else {
                    float fB = EdgeEffectCompat.b(edgeEffect4, width, height);
                    if (EdgeEffectCompat.a(this.mRightGlow) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    private int releaseVerticalGlow(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (edgeEffect != null && EdgeEffectCompat.a(edgeEffect) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            boolean zCanScrollVertically = canScrollVertically(-1);
            EdgeEffect edgeEffect2 = this.mTopGlow;
            if (zCanScrollVertically) {
                edgeEffect2.onRelease();
            } else {
                float f3 = -EdgeEffectCompat.b(edgeEffect2, -height, width);
                if (EdgeEffectCompat.a(this.mTopGlow) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect3 = this.mBottomGlow;
            if (edgeEffect3 != null && EdgeEffectCompat.a(edgeEffect3) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                boolean zCanScrollVertically2 = canScrollVertically(1);
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (zCanScrollVertically2) {
                    edgeEffect4.onRelease();
                } else {
                    float fB = EdgeEffectCompat.b(edgeEffect4, height, 1.0f - width);
                    if (EdgeEffectCompat.a(this.mBottomGlow) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    public void animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        addAnimatingView(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.c(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                e32.i(nj.n(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
            } else {
                e32.i(nj.n(this, h50.p(str)));
            }
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                e32.i(nj.n(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
                return;
            } else {
                e32.i(str);
                return;
            }
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(nj.n(this, new StringBuilder(""))));
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = ViewCompat.a;
        setMeasuredDimension(LayoutManager.chooseSize(i, paddingRight, getMinimumWidth()), LayoutManager.chooseSize(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        int paddingTop;
        boolean z2;
        boolean z3;
        int paddingBottom;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z4 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z5 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int iSave = canvas.save();
            if (this.mClipToPadding) {
                paddingBottom = getPaddingBottom();
            } else {
                paddingBottom = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(iSave);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(iSave4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.k()) {
            z5 = z;
        }
        if (z5) {
            WeakHashMap weakHashMap = ViewCompat.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void fillRemainingScrollValues(State state) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            state.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        state.getClass();
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Nullable
    public ViewHolder findContainingViewHolder(@NonNull View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public int getChildAdapterPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            d10.c("View ", view, " is not a direct child of ", this);
            return null;
        }
        return getChildViewHolderInt(view);
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z = layoutParams.c;
        Rect rect = layoutParams.b;
        if (!z || (this.mState.g && (layoutParams.a.isUpdated() || layoutParams.a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.c = false;
        return rect;
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        this.mRecycler.e();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = GapWorker.e;
            GapWorker gapWorker = (GapWorker) threadLocal.get();
            this.mGapWorker = gapWorker;
            if (gapWorker == null) {
                GapWorker gapWorker2 = new GapWorker();
                gapWorker2.a = new ArrayList();
                gapWorker2.d = new ArrayList();
                this.mGapWorker = gapWorker2;
                WeakHashMap weakHashMap = ViewCompat.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                } else {
                    refreshRate = 60.0f;
                }
                GapWorker gapWorker3 = this.mGapWorker;
                gapWorker3.c = (long) (1.0E9f / refreshRate);
                threadLocal.set(gapWorker3);
            }
            this.mGapWorker.a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.j();
        }
        stopScroll();
        this.mIsAttached = false;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (ViewInfoStore.InfoRecord.d.a() != null) {
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.c;
        for (int i = 0; i < arrayList.size(); i++) {
            PoolingContainer.b(((ViewHolder) arrayList.get(i)).itemView);
        }
        recycler.f(RecyclerView.this.mAdapter, false);
        PoolingContainer.c(this);
        if (ALLOW_THREAD_GAP_WORK && (gapWorker = this.mGapWorker) != null) {
            gapWorker.a.remove(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        ChildHelper childHelper = this.mChildHelper;
        ChildHelper.Bucket bucket = childHelper.b;
        AnonymousClass5 anonymousClass5 = childHelper.a;
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        boolean z = true;
        if (iIndexOfChild == -1) {
            childHelper.f(view);
        } else if (bucket.d(iIndexOfChild)) {
            bucket.f(iIndexOfChild);
            childHelper.f(view);
            anonymousClass5.b(iIndexOfChild);
        } else {
            z = false;
        }
        if (z) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m(childViewHolderInt);
            this.mRecycler.j(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                d.r(nj.n(this, sb));
                return;
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void scrollStep(int i, int i2, @Nullable int[] iArr) {
        int iScrollHorizontallyBy;
        int iScrollVerticallyBy;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i3 = TraceCompat.a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i != 0) {
            iScrollHorizontallyBy = this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState);
        } else {
            iScrollHorizontallyBy = 0;
        }
        if (i2 != 0) {
            iScrollVerticallyBy = this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState);
        } else {
            iScrollVerticallyBy = 0;
        }
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @VisibleForTesting
    public boolean setChildImportantForAccessibilityInternal(ViewHolder viewHolder, int i) {
        if (isComputingLayout()) {
            viewHolder.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(viewHolder);
            return false;
        }
        View view = viewHolder.itemView;
        WeakHashMap weakHashMap = ViewCompat.a;
        view.setImportantForAccessibility(i);
        return true;
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        edgeEffectFactory.getClass();
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().g(z);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int contentChangeTypes;
        int i = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            contentChangeTypes = accessibilityEvent.getContentChangeTypes();
        } else {
            contentChangeTypes = 0;
        }
        if (contentChangeTypes != 0) {
            i = contentChangeTypes;
        }
        this.mEatenAccessibilityChangeFlags |= i;
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().i(i);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().f(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().h(i, i2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, null);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NonNull int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        e32.i(nj.n(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }

    @Nullable
    @Deprecated
    public ViewHolder findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public void smoothScrollBy(@Px int i, @Px int i2) {
        smoothScrollBy(i, i2, null);
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }
}
