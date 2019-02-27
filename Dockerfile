FROM clojure:onbuild
RUN curl -O https://download.clojure.org/install/linux-install-1.10.0.414.sh && chmod +x linux-install-1.10.0.414.sh && ./linux-install-1.10.0.414.sh 
# Download deps
RUN clojure
CMD ["lein", "run"]