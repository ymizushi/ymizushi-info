ymizushi-info
================================

[![Build Status](https://travis-ci.org/ymizushi/ymizushi-info.png?branch=master)](https://travis-ci.org/ymizushi/ymizushi-info)

http://ymizushi.info

The website about ymizushi using clojure/compojure.

## Purpose
Profile site about ymizushi.

## Requirements
- leiningen 2.0 or later.

These requirements are automatically installed by leiningen.

## Install
1. Mac OS X
 
 ```sh
brew install curl
brew install wget
brew install clojure
brew install leiningen
brew install postgres
brew install rlwrap
```

## Initialize

 ```sh
initdb pg
postgres -D pg &
createdb ymizushi

export DATABASE_URL=postgresql://localhost:5432/ymizushi
export session_secret=hogehoge
lein run -m ymizushi-info.manage
```

# Postgres commands
 ```sh
psql minosound
postgres=> \d
```

## Usage

 ```sh
lein ring server
```

## Unit test

 ```sh
lein test
```

## Coverage

 ```sh
lein cloverage
```

Output files are located in ./target/coverage/ and open index.html.

## License
Copyright © 2013 ymizushi

Distributed under the Eclipse Public License, the same as Clojure.

--------------------------------

自己紹介です。

## 目的
特にありませんが、強いて言えばClojureの練習です。
