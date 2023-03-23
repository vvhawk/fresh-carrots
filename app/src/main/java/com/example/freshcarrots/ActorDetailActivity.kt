//package com.example.freshcarrots
//
//class ActorDetailActivity : AppCompatActivity() {
//    private lateinit var mediaImageView: ImageView
//    private lateinit var titleTextView: TextView
//    private lateinit var bylineTextView: TextView
//    private lateinit var abstractTextView: TextView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_detail)
//
//        // TODO: Find the views for the screen
//
//        mediaImageView = findViewById(R.id.profile)
//        titleTextView = findViewById(R.id.name)
//        bylineTextView = findViewById(R.id.role)
//        abstractTextView = findViewById(R.id.knownFor)
//
//        // TODO: Get the extra from the Intent
//
//        val article = intent.getSerializableExtra(ARTICLE_EXTRA) as Article
//
//        // TODO: Set the title, byline, and abstract information from the article
//
//        titleTextView.text = article.headline?.main
//        bylineTextView.text = article.byline?.original
//        abstractTextView.text = article.abstract
//
//        // TODO: Load the media image
//
//        Glide.with(this)
//            .load(article.mediaImageUrl)
//            .into(mediaImageView)
//    }
//}