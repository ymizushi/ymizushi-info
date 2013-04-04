EXCLUDE = --exclude=.git --exclude=Makefile --exclude=.gitignore --exclude=.DS_Store
OPT = -cropgtv --delete $(EXCLUDE)
LOCAL_PATH = .

REMOTE_USER=ymizushi
REMOTE_HOST=shingeki-mederu.net
REMOTE_PATH=~/ymizushi-info

default:
	@echo "Usage:"
	@echo " make install"
	@echo " make dry-install"
	@echo " make bacuum"
	@echo " make dry-bacuum"

install: rsync
bacuum: take
dry-install: dry-rsync
dry-bacuum: dry-take

rsync:
	rsync $(OPT) $(LOCAL_PATH)/ $(REMOTE_USER)@$(REMOTE_HOST):$(REMOTE_PATH)

take:
	rsync $(OPT) $(REMOTE_USER)@$(REMOTE_HOST):$(REMOTE_PATH)/ $(LOCAL_PATH)/

restart:
	ssh $(REMOTE_USER)@$(REMOTE_HOST) 'sudo /etc/init.d/mizushima_gunicorn restart'

dry-rsync:
	$(MAKE) rsync \
			OPT="--dry-run $(OPT)"

dry-take:
	$(MAKE) take \
			OPT="--dry-run $(OPT)"
