project_name = "heimdal-front"
repo = "https://github.com/Teloggy/Heimdal-Front.git"
repo_name = "Heimdal-Front"

pipelineJob (project_name){
    definition{
	triggers{
	    scm('H/1 * * * *')
	}
	cpsScm{
	    scm{
		git{    		    
		    remote{
			name(repo_name)
			url(repo)
			refspec(null)
		        credentials('yahergitteloggy')
		    }
		    branches('master')		    
                }
		scriptPath("Jenkinsfile")
	    }
	}
    }
}