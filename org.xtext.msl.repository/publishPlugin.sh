#!/bin/bash

rsync -avP -e ssh --delete  --chmod=g+rx,o+rx  --exclude=.DS_Store --exclude=.project --exclude=.settings/ --exclude=publishPlugin.sh --verbose . arcaini@fmse.di.unimi.it:/var/www/fmse.di.unimi.it/htdocs/sw/msl/updatesite
