package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class ap extends bp {
    public final /* synthetic */ CarouselLayoutManager b;

    @Override // defpackage.bp
    public final int b() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.b = carouselLayoutManager;
    }

    @Override // defpackage.bp
    public final int a() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
    }

    @Override // defpackage.bp
    public final int c() {
        return this.b.getWidth();
    }

    @Override // defpackage.bp
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        if (carouselLayoutManager.o()) {
            return carouselLayoutManager.getWidth();
        }
        return 0;
    }

    @Override // defpackage.bp
    public final int e() {
        return this.b.getPaddingTop();
    }
}
