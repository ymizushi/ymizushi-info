LOCAL_PATH = ./target
TARGET_FILE = root.war

REMOTE_USER=ymizushi
REMOTE_HOST=ymizushi.info
REMOTE_PATH=~/webapps

default:
	@echo "Usage:"
	@echo " make war"
	@echo " make scp"

war:
	lein ring uberwar root.war

restart:
	ssh -t $(REMOTE_USER)@$(REMOTE_HOST) 'sudo service jetty restart'

scp:
	scp $(LOCAL_PATH)/$(TARGET_FILE) $(REMOTE_USER)@$(REMOTE_HOST):$(REMOTE_PATH)

deploy: scp restart
