package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    final MediaController.Callback f118a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    a f119b;

    private static class a extends MediaController.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f120a;

        a(c cVar) {
            this.f120a = new WeakReference<>(cVar);
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            c cVar = this.f120a.get();
            if (cVar != null) {
                cVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f120a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            c cVar = this.f120a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(mediaMetadata));
            }
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            c cVar = this.f120a.get();
            if (cVar != null && cVar.f119b == null) {
                cVar.d(PlaybackStateCompat.a(playbackState));
            }
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            c cVar = this.f120a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            c cVar = this.f120a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        public void onSessionDestroyed() {
            c cVar = this.f120a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f120a.get();
            if (cVar != null) {
                a aVar = cVar.f119b;
                cVar.h(str, bundle);
            }
        }
    }

    private static class b extends a.C0004a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f121a;

        b(c cVar) {
            this.f121a = new WeakReference<>(cVar);
        }

        public void D(int i10) {
            c cVar = this.f121a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i10), (Bundle) null);
            }
        }

        public void N0(PlaybackStateCompat playbackStateCompat) {
            c cVar = this.f121a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, (Bundle) null);
            }
        }

        public void a(String str, Bundle bundle) {
            c cVar = this.f121a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        public void b0(boolean z10) {
            c cVar = this.f121a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z10), (Bundle) null);
            }
        }

        public void i() {
            c cVar = this.f121a.get();
            if (cVar != null) {
                cVar.i(13, (Object) null, (Bundle) null);
            }
        }

        public void m0(boolean z10) {
        }

        public void y0(int i10) {
            c cVar = this.f121a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i10), (Bundle) null);
            }
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    public void binderDied() {
        i(8, (Object) null, (Bundle) null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void i(int i10, Object obj, Bundle bundle) {
    }
}
