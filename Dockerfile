FROM clojure:onbuild
ENV VERSION=linux-install-1.10.0.414.sh
RUN curl -O https://download.clojure.org/install/$VERSION && chmod +x $VERSION && ./$VERSION
# Download deps
RUN clojure
CMD ["lein", "run"]